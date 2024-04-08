package kr.jaen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.jaen.domain.Class;
@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
}
