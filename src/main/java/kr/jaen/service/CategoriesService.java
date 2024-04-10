package kr.jaen.service;

import kr.jaen.domain.Categories;
import kr.jaen.repository.CategoriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoriesService {
    private final CategoriesRepository categoriedRepository;
    public List<Categories> getAllCategories(){
        return categoriedRepository.findAll();
    }
}
