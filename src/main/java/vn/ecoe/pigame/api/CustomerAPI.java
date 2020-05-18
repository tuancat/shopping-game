package vn.ecoe.pigame.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.FilterObject;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.utils.ApiConstants;
import vn.ecoe.pigame.utils.Constants;

@Api
public interface CustomerAPI {
    @ApiOperation(value = "Add customer", response = ResponseModel.class)
    @PostMapping(path = ApiConstants.CUSTOMER_END_POINT)
    ResponseModel add(@RequestBody CustomerDTO dto);

    @ApiOperation(value = "Update customer", response = ResponseModel.class)
    @PutMapping(path = ApiConstants.CUSTOMER_BY_ID_END_POINT)
    ResponseModel update(@PathVariable String id, @RequestBody CustomerDTO dto);

    @ApiOperation(value = "Find by customer id", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.CUSTOMER_BY_ID_END_POINT)
    ResponseModel findById(@PathVariable String id);

    @ApiOperation(value = "Delete customer by Id", response = ResponseModel.class)
    @DeleteMapping(path = ApiConstants.CUSTOMER_BY_ID_END_POINT)
    ResponseModel delete(@PathVariable String id);

    @ApiOperation(value = "Get customer paging", response = ResponseModel.class)
    @PostMapping(path = ApiConstants.CUSTOMERS_END_POINT)
    ResponseModel paging(
            @RequestBody FilterObject filterObject,
            @RequestParam(name = "page", required = false, defaultValue = Constants.DEFAULT_PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.DEFAULT_MAX_NO_OF_ROWS) Integer size,
            @RequestParam(name = "order", required = false, defaultValue = Constants.A_Z_ASC_KEY) String order);

}
