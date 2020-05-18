package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.CityDTO;
import vn.ecoe.pigame.dto.TradingDTO;

import java.util.List;

public interface CitiesService {

    CityDTO add(CityDTO dto);

    CityDTO findById(long id);

    boolean delete(long id);

    CityDTO update(long id, CityDTO dto);

    List<CityDTO> findAll();
}
