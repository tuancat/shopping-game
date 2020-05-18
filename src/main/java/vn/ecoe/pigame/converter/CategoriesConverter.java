package vn.ecoe.pigame.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.ecoe.pigame.dto.CategoriesDTO;
import vn.ecoe.pigame.dto.ProductDTO;
import vn.ecoe.pigame.model.Categories;
import vn.ecoe.pigame.model.Product;


@Component("categories_converter")
public class CategoriesConverter extends SuperConverter<CategoriesDTO, Categories> {


    @Autowired
    ModelMapper mapper;

    @Override
    public CategoriesDTO convertToDTO(Categories entity) {
        return mapper.map(entity, CategoriesDTO.class);
    }

    @Override
    public Categories convertToEntity(CategoriesDTO dto) {
        return mapper.map(dto, Categories.class);
    }

    @Override
    public CategoriesDTO convertEntityToDTOByUserId(String contactId, Categories entity) {
        return null;
    }
}
