package vn.ecoe.pigame.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.ecoe.pigame.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByNameContaining(String name, Pageable pageable);
}
