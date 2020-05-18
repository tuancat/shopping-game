package vn.ecoe.pigame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ecoe.pigame.model.Trading;

import java.util.List;

public interface TradingRepository extends JpaRepository<Trading, Long> {
    List<Trading> findByNameContaining(String name);
}
