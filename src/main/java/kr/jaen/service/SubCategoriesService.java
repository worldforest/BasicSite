package kr.jaen.service;

import kr.jaen.domain.SubCategories;
import kr.jaen.repository.SubCategoriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SubCategoriesService {
    private final SubCategoriesRepository subCategoriesRepository;
    public List<SubCategories> getAll(){
        return subCategoriesRepository.findAll();
    }
    public List<SubCategories> findByCategoryId(Integer categoryId){
        return subCategoriesRepository.findByCategoryId(categoryId);
    }
}
