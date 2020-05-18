package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.JobDTO;
import vn.ecoe.pigame.dto.TradingDTO;

import java.util.List;

public interface JobService {
    JobDTO add(JobDTO dto);

    JobDTO findById(long id);

    boolean delete(long id);

    JobDTO update(long id, JobDTO dto);

    List<JobDTO> findAll();
}
