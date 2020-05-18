package vn.ecoe.pigame.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.utils.ApiConstants;
@Api
public interface CitiesAPI {



    @ApiOperation(value = "Find by city id", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.CITTES_BY_ID_END_POINT)
    ResponseModel findById(@PathVariable long id);



    @ApiOperation(value = "Find Citites", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.CITES_END_POINT)
    ResponseModel findAll();
}
