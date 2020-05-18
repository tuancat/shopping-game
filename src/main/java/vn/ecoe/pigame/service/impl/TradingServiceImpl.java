package vn.ecoe.pigame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.ecoe.pigame.converter.TradingConverter;
import vn.ecoe.pigame.dto.TradingDTO;
import vn.ecoe.pigame.exception.ResourceNotFoundException;
import vn.ecoe.pigame.model.Trading;
import vn.ecoe.pigame.repository.TradingRepository;
import vn.ecoe.pigame.service.TradingService;
import vn.ecoe.pigame.utils.Constants;

import java.util.List;
import java.util.Optional;

@Service
public class TradingServiceImpl implements TradingService {

    @Autowired
    TradingRepository tradingRepository;

    @Autowired
    TradingConverter tradingConverter;

    @Override
    public TradingDTO add(TradingDTO dto) {
        Trading trading = tradingConverter.convertToEntity(dto);
        trading.setId(null);
        return tradingConverter.convertToDTO(tradingRepository.save(trading));
    }

    @Override
    public TradingDTO findById(long id) {
        Optional<Trading> optional = tradingRepository.findById(id);
        if (!optional.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        return tradingConverter.convertToDTO(optional.get());
    }

    @Override
    public boolean delete(long id) {
        Optional<Trading> optional = tradingRepository.findById(id);
        if (!optional.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        tradingRepository.deleteById(id);
        return true;
    }

    @Override
    public TradingDTO update(long id, TradingDTO dto) {
        Optional<Trading> optional = tradingRepository.findById(id);
        if (!optional.isPresent())
            throw new ResourceNotFoundException(Constants.CAN_NOT_BE_FOUND_ENTITY_MESSAGE);
        return null;
    }

    @Override
    public List<TradingDTO> findAll() {
        List<Trading> tradings = tradingRepository.findAll();
        return tradingConverter.convertEntitiesToDTOs(tradings);
    }
}
