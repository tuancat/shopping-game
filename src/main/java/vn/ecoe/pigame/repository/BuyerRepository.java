package vn.ecoe.pigame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ecoe.pigame.model.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
