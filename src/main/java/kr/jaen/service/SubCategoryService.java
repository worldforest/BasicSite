package kr.jaen.service;

import kr.jaen.domain.SubCategory;
import kr.jaen.repository.SubCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SubCategoryService {
    private final SubCategoryRepository subCategoryRepository;
    public List<SubCategory> getAll(){
        return subCategoryRepository.findAll();
    }
    public List<SubCategory> findByCategoryId(Integer categoryId){
        return subCategoryRepository.findByCategoryId(categoryId);
    }
}
