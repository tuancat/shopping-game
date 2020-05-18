package vn.ecoe.pigame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.ecoe.pigame.converter.CitiesConverter;
import vn.ecoe.pigame.dto.CityDTO;
import vn.ecoe.pigame.dto.TradingDTO;
import vn.ecoe.pigame.model.City;
import vn.ecoe.pigame.model.Trading;
import vn.ecoe.pigame.repository.CityRepository;
import vn.ecoe.pigame.service.CitiesService;

import java.util.List;


@Service
public class CitiesServiceImpl implements CitiesService {

    @Autowired
    CitiesConverter citiesConverter;
    @Autowired
    CityRepository cityRepository;

    @Override
    public CityDTO add(CityDTO dto) {
        return null;
    }

    @Override
    public CityDTO findById(long id) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public CityDTO update(long id, CityDTO dto) {
        return null;
    }

    @Override
    public List<CityDTO> findAll() {
        List<City> listCitites = cityRepository.findAll();
        return citiesConverter.convertEntitiesToDTOs(listCitites);
    }
}
