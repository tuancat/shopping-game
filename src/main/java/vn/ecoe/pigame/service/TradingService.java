package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.dto.TradingDTO;

import java.util.List;

public interface TradingService {
    TradingDTO add(TradingDTO dto);

    TradingDTO findById(long id);

    boolean delete(long id);

    TradingDTO update(long id, TradingDTO dto);

    List<TradingDTO> findAll();
}
