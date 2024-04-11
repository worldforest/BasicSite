package kr.jaen.repository;

import kr.jaen.domain.SubCategories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubCategoriesRepository extends JpaRepository<SubCategories, Integer> {
    List<SubCategories> findByCategoryId(Integer categoryId);
}
