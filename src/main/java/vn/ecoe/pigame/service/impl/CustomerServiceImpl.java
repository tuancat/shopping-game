package vn.ecoe.pigame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.ecoe.pigame.converter.CustomerConverter;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.exception.ResourceNotFoundException;
import vn.ecoe.pigame.model.Customer;
import vn.ecoe.pigame.repository.CustomerRepository;
import vn.ecoe.pigame.response.PagedResult;
import vn.ecoe.pigame.service.CustomerService;
import vn.ecoe.pigame.utils.Constants;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerConverter customerConverter;

    @Override
    public CustomerDTO add(CustomerDTO dto) {
        Customer customer = customerConverter.convertToEntity(dto);
        customer.setId(null);
        return customerConverter.convertToDTO(customerRepository.save(customer));
    }

    @Override
    public CustomerDTO findById(String id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        return customerConverter.convertToDTO(customer.get());
    }

    @Override
    public boolean delete(String id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        customerRepository.deleteById(id);
        return true;
    }

    @Override
    public CustomerDTO update(String id, CustomerDTO dto) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (!customer.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        Customer customerModify = customerConverter.convertToEntity(dto);
        customerModify.setId(id);
        return customerConverter.convertToDTO(customerRepository.save(customerModify));
    }

    @Override
    public PagedResult<CustomerDTO> findAll(String name, int page, int size, String order) {
        if (StringUtils.isEmpty(name))
            name = Constants.BLANK;
        Sort sortable = Sort.by(Sort.Direction.fromString(order), "name");
        Pageable pageable = PageRequest.of(page, size, sortable);
        Page<Customer> pageResult = customerRepository.findByNameContaining(name, pageable);
        return new PagedResult<>(
                customerConverter.convertEntitiesToDTOs(pageResult.getContent()), pageResult.getTotalPages(),
                pageResult.getTotalElements(), page, size);
    }
}
