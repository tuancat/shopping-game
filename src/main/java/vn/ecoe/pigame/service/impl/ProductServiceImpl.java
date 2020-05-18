package vn.ecoe.pigame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.ecoe.pigame.converter.ProductConverter;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.ProductDTO;
import vn.ecoe.pigame.exception.ResourceNotFoundException;
import vn.ecoe.pigame.model.Customer;
import vn.ecoe.pigame.model.Product;
import vn.ecoe.pigame.repository.ProductRepository;
import vn.ecoe.pigame.response.PagedResult;
import vn.ecoe.pigame.service.ProductService;
import vn.ecoe.pigame.utils.Constants;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductConverter productConverter;

    @Override
    public ProductDTO add(ProductDTO dto) {
        Product product = productConverter.convertToEntity(dto);
        product.setId(null);
        return productConverter.convertToDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        return productConverter.convertToDTO(product.get());
    }

    @Override
    public boolean delete(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        productRepository.deleteById(id);
        return true;
    }

    @Override
    public ProductDTO update(Long id, ProductDTO dto) {
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        Product productModify = productConverter.convertToEntity(dto);
        productModify.setId(id);
        return productConverter.convertToDTO(productRepository.save(productModify));
    }

    @Override
    public PagedResult<ProductDTO> findAll(String name, int page, int size, String order) {
        if (StringUtils.isEmpty(name))
            name = Constants.BLANK;
        Sort sortable = Sort.by(Sort.Direction.fromString(order), "name");
        Pageable pageable = PageRequest.of(page, size, sortable);
        Page<Product> pageResult = productRepository.findByNameContaining(name, pageable);
        return new PagedResult<>(
                productConverter.convertEntitiesToDTOs(pageResult.getContent()), pageResult.getTotalPages(),
                pageResult.getTotalElements(), page, size);
    }
}
