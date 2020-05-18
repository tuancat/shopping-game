package vn.ecoe.pigame.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.ecoe.pigame.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Page<Customer> findByNameContaining(String name, Pageable pageable);
}
