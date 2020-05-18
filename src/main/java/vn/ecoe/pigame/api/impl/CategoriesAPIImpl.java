package vn.ecoe.pigame.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.ecoe.pigame.api.CategoriesAPI;
import vn.ecoe.pigame.dto.CategoriesDTO;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.service.CategoriesService;
@RestController
public class CategoriesAPIImpl implements CategoriesAPI {

    @Autowired
    CategoriesService categoriesService;

    @Override
    public ResponseModel add(CategoriesDTO dto) {
        return new ResponseModel(categoriesService.add(dto));
    }

    @Override
    public ResponseModel update(long id, CategoriesDTO dto) {
        return new ResponseModel(categoriesService.update(id, dto));
    }

    @Override
    public ResponseModel findById(long id) {
        return new ResponseModel(categoriesService.findById(id));
    }

    @Override
    public ResponseModel delete(long id) {
        return new ResponseModel(categoriesService.delete(id));
    }

    @Override
    public ResponseModel findAll() {
        return new ResponseModel(categoriesService.findAll());
    }
}
