package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.BuyerDTO;
import vn.ecoe.pigame.dto.JobDTO;

import java.util.List;

public interface BuyerService {
    BuyerDTO add(JobDTO dto);

    BuyerDTO findById(long id);

    boolean delete(long id);

    BuyerDTO update(long id, BuyerDTO dto);

    List<BuyerDTO> findAll();
}
