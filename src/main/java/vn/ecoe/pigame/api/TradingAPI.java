package vn.ecoe.pigame.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.FilterObject;
import vn.ecoe.pigame.dto.TradingDTO;
import vn.ecoe.pigame.model.Trading;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.utils.ApiConstants;

@Api
public interface TradingAPI {

    @ApiOperation(value = "Add daily report ", response = ResponseModel.class)
    @PostMapping(path = ApiConstants.TRADING_END_POINT)
    ResponseModel add(@RequestBody TradingDTO dto);

    @ApiOperation(value = "Update trading ", response = ResponseModel.class)
    @PutMapping(path = ApiConstants.TRADING_BY_ID_END_POINT)
    ResponseModel update(@PathVariable long id, @RequestBody TradingDTO dto);

    @ApiOperation(value = "Find by trading id", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.TRADING_BY_ID_END_POINT)
    ResponseModel findById(@PathVariable long id);

    @ApiOperation(value = "Delete trading by Id", response = ResponseModel.class)
    @DeleteMapping(path = ApiConstants.TRADING_BY_ID_END_POINT)
    ResponseModel delete(@PathVariable long id);

    @ApiOperation(value = "Find All", response = ResponseModel.class)
    @GetMapping(path = ApiConstants.TRADINGS_END_POINT)
    ResponseModel findAll();
}
