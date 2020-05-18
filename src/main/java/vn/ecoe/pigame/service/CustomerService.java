package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.response.PagedResult;

public interface CustomerService {
    CustomerDTO add(CustomerDTO dto);

    CustomerDTO findById(String id);

    boolean delete(String id);

    CustomerDTO update(String id, CustomerDTO dto);

    PagedResult<CustomerDTO> findAll(String name, int page, int size, String order);
}
