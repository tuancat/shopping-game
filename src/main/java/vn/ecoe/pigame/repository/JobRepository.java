package vn.ecoe.pigame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ecoe.pigame.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
