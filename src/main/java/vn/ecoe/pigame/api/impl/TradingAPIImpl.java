package vn.ecoe.pigame.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.ecoe.pigame.api.TradingAPI;
import vn.ecoe.pigame.dto.FilterObject;
import vn.ecoe.pigame.dto.TradingDTO;
import vn.ecoe.pigame.response.ResponseModel;
import vn.ecoe.pigame.service.TradingService;

@RestController
public class TradingAPIImpl implements TradingAPI {

    @Autowired
    TradingService tradingService;

    @Override
    public ResponseModel add(TradingDTO dto) {
        return new ResponseModel(tradingService.add(dto));
    }

    @Override
    public ResponseModel update(long id, TradingDTO dto) {
        return new ResponseModel(tradingService.update(id, dto));
    }

    @Override
    public ResponseModel findById(long id) {
        return new ResponseModel(tradingService.findById(id));
    }

    @Override
    public ResponseModel delete(long id) {
        return new ResponseModel(tradingService.delete(id));
    }

    @Override
    public ResponseModel findAll() {
        return new ResponseModel(tradingService.findAll());
    }
}
