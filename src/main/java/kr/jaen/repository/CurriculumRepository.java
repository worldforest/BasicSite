package kr.jaen.repository;

import kr.jaen.domain.Curriculum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurriculumRepository extends JpaRepository<Curriculum, Integer> {
    List<Curriculum> findByClassId(Integer classId);
}
