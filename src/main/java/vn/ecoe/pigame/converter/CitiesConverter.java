package vn.ecoe.pigame.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.ecoe.pigame.dto.CityDTO;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.model.City;
import vn.ecoe.pigame.model.Customer;


@Component("cities_converter")
public class CitiesConverter extends SuperConverter<CityDTO, City> {

    @Autowired
    ModelMapper mapper;

    @Override
    public CityDTO convertToDTO(City entity) {
        return mapper.map(entity, CityDTO.class);
    }

    @Override
    public City convertToEntity(CityDTO dto) {
        return mapper.map(dto, City.class);
    }

    @Override
    public CityDTO convertEntityToDTOByUserId(String contactId, City entity) {
        return null;
    }
}
