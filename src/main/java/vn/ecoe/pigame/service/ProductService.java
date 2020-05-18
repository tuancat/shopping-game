package vn.ecoe.pigame.service;

import vn.ecoe.pigame.dto.ProductDTO;
import vn.ecoe.pigame.response.PagedResult;

public interface ProductService {

    ProductDTO add(ProductDTO dto);

    ProductDTO findById(Long id);

    boolean delete(Long id);

    ProductDTO  update(Long id, ProductDTO dto);

    PagedResult<ProductDTO> findAll(String name, int page, int size, String order);
}
