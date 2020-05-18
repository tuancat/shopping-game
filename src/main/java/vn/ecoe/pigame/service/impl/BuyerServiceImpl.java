package vn.ecoe.pigame.service.impl;

import org.springframework.stereotype.Service;
import vn.ecoe.pigame.dto.BuyerDTO;
import vn.ecoe.pigame.dto.JobDTO;
import vn.ecoe.pigame.service.BuyerService;

import java.util.List;
@Service
public class BuyerServiceImpl implements BuyerService {
    @Override
    public BuyerDTO add(JobDTO dto) {
        return null;
    }

    @Override
    public BuyerDTO findById(long id) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public BuyerDTO update(long id, BuyerDTO dto) {
        return null;
    }

    @Override
    public List<BuyerDTO> findAll() {
        return null;
    }
}
