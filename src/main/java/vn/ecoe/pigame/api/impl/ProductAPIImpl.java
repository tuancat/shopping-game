package vn.ecoe.pigame.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.ecoe.pigame.api.ProductAPI;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.FilterObject;
import vn.ecoe.pigame.dto.ProductDTO;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.service.ProductService;

@RestController
public class ProductAPIImpl implements ProductAPI {
    @Autowired
    private ProductService productService;

    @Override
    public ResponseModel add(ProductDTO dto) {
        return new ResponseModel(productService.add(dto));
    }

    @Override
    public ResponseModel update(Long id, ProductDTO dto) {
        return new ResponseModel(productService.update(id, dto));
    }

    @Override
    public ResponseModel findById(Long id) {
        return new ResponseModel(productService.findById(id));
    }

    @Override
    public ResponseModel delete(Long id) {
        return new ResponseModel(productService.delete(id));
    }

    @Override
    public ResponseModel paging(FilterObject filterObject, Integer page, Integer size, String order) {
        return new ResponseModel(productService.findAll(filterObject.getName(), page, size, order));
    }
}
