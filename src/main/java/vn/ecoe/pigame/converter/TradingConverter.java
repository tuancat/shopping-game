package vn.ecoe.pigame.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.ecoe.pigame.dto.TradingDTO;
import vn.ecoe.pigame.model.Trading;

@Component("trading_converter")
public class TradingConverter extends SuperConverter<TradingDTO, Trading> {

    @Autowired
    ModelMapper mapper;

    @Override
    public TradingDTO convertToDTO(Trading entity) {
        return mapper.map(entity, TradingDTO.class);
    }

    @Override
    public Trading convertToEntity(TradingDTO dto) {
        return mapper.map(dto, Trading.class);
    }

    @Override
    public TradingDTO convertEntityToDTOByUserId(String contactId, Trading entity) {
        return null;
    }
}
