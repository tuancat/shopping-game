package vn.ecoe.pigame.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import vn.ecoe.pigame.dto.CategoriesDTO;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.utils.ApiConstants;
@Api
public interface CategoriesAPI {

    @ApiOperation(value = "Add categories", response = ResponseModel.class)
    @PostMapping(path = ApiConstants.CATEGORY_END_POINT)
    ResponseModel add(@RequestBody CategoriesDTO dto);

    @ApiOperation(value = "Update categories ", response = ResponseModel.class)
    @PutMapping(path = ApiConstants.CATEGORY_BY_ID_END_POINT)
    ResponseModel update(@PathVariable long id, @RequestBody CategoriesDTO dto);

    @ApiOperation(value = "Find by categories id", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.CATEGORY_BY_ID_END_POINT)
    ResponseModel findById(@PathVariable long id);

    @ApiOperation(value = "Delete categories by Id", response = ResponseModel.class)
    @DeleteMapping(path = ApiConstants.CATEGORY_BY_ID_END_POINT)
    ResponseModel delete(@PathVariable long id);

    @ApiOperation(value = "Find categories", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.CATEGORIES_END_POINT)
    ResponseModel findAll();
}
