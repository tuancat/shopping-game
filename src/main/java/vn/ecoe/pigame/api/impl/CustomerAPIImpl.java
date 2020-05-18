package vn.ecoe.pigame.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.ecoe.pigame.api.CustomerAPI;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.FilterObject;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.service.CustomerService;

@RestController
public class CustomerAPIImpl implements CustomerAPI {

    @Autowired
    CustomerService customerService;

    @Override
    public ResponseModel add(CustomerDTO dto) {
        return new ResponseModel(customerService.add(dto));
    }

    @Override
    public ResponseModel update(String id, CustomerDTO dto) {
        return new ResponseModel(customerService.update(id, dto));
    }

    @Override
    public ResponseModel findById(String id) {
        return new ResponseModel(customerService.findById(id));
    }

    @Override
    public ResponseModel delete(String id) {
        return new ResponseModel(customerService.delete(id));
    }

    @Override
    public ResponseModel paging(FilterObject filterObject, Integer page, Integer size, String order) {
        return new ResponseModel(customerService.findAll(filterObject.getName(), page, size, order));
    }
}
