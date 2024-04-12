package kr.jaen.repository;

import kr.jaen.domain.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
    List<SubCategory> findByCategoryId(Integer categoryId);
}
