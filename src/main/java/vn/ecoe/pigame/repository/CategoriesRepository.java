package vn.ecoe.pigame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.ecoe.pigame.model.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
