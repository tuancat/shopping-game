package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.CategoriesDTO;
import vn.ecoe.pigame.dto.TradingDTO;

import java.util.List;

public interface CategoriesService {
    CategoriesDTO add(CategoriesDTO dto);

    CategoriesDTO findById(long id);

    boolean delete(long id);

    CategoriesDTO update(long id, CategoriesDTO dto);

    List<CategoriesDTO> findAll();
}
