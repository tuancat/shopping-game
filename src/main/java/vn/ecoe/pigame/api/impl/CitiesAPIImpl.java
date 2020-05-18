package vn.ecoe.pigame.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.ecoe.pigame.api.CitiesAPI;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.service.CitiesService;


@RestController
public class CitiesAPIImpl implements CitiesAPI {
    @Autowired
    CitiesService citiesService;

    @Override
    public ResponseModel findById(long id) {
        return null;
    }

    @Override
    public ResponseModel findAll() {
        return new ResponseModel(citiesService.findAll());
    }
}
