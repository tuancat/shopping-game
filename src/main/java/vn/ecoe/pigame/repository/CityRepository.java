package vn.ecoe.pigame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ecoe.pigame.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
}
