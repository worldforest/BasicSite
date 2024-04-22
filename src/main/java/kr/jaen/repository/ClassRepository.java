package kr.jaen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kr.jaen.domain.Class;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
    // category별 강의목록 조회
    List<Class> findByCategoryId(Integer categoryId);
    List<Class> findBySubcategoryId(Integer subcategoryId);
    // 각 클래스 기본정보 조회
    List<Class> findByIndex(Integer index);
}
