package vn.ecoe.pigame.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.ecoe.pigame.dto.CityDTO;
import vn.ecoe.pigame.dto.ProductDTO;
import vn.ecoe.pigame.model.City;
import vn.ecoe.pigame.model.Product;


@Component("product_converter")
public class ProductConverter extends SuperConverter<ProductDTO, Product> {

    @Autowired
    ModelMapper mapper;
    @Override
    public ProductDTO convertToDTO(Product entity) {
        return mapper.map(entity, ProductDTO.class);
    }

    @Override
    public Product convertToEntity(ProductDTO dto) {
        return mapper.map(dto, Product.class);
    }

    @Override
    public ProductDTO convertEntityToDTOByUserId(String contactId, Product entity) {
        return null;
    }
}
