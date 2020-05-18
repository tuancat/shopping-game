package vn.ecoe.pigame.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.FilterObject;
import vn.ecoe.pigame.dto.ProductDTO;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.utils.ApiConstants;
import vn.ecoe.pigame.utils.Constants;
@Api
public interface ProductAPI {
    @ApiOperation(value = "Add product", response = ResponseModel.class)
    @PostMapping(path = ApiConstants.PRODUCT_END_POINT)
    ResponseModel add(@RequestBody ProductDTO dto);

    @ApiOperation(value = "Update product", response = ResponseModel.class)
    @PutMapping(path = ApiConstants.PRODUCT_BY_ID_END_POINT)
    ResponseModel update(@PathVariable Long id, @RequestBody ProductDTO dto);

    @ApiOperation(value = "Find by product id", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.PRODUCT_BY_ID_END_POINT)
    ResponseModel findById(@PathVariable Long id);

    @ApiOperation(value = "Delete product by Id", response = ResponseModel.class)
    @DeleteMapping(path = ApiConstants.PRODUCT_BY_ID_END_POINT)
    ResponseModel delete(@PathVariable Long id);

    @ApiOperation(value = "Get product paging", response = ResponseModel.class)
    @PostMapping(path = ApiConstants.PRODUCTS_END_POINT)
    ResponseModel paging(
            @RequestBody FilterObject filterObject,
            @RequestParam(name = "page", required = false, defaultValue = Constants.DEFAULT_PAGE) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = Constants.DEFAULT_MAX_NO_OF_ROWS) Integer size,
            @RequestParam(name = "order", required = false, defaultValue = Constants.A_Z_ASC_KEY) String order);
}
