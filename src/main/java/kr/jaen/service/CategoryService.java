package kr.jaen.service;

import kr.jaen.domain.Category;
import kr.jaen.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryService {
    private final CategoryRepository categoriedRepository;
    public List<Category> getAll(){
        return categoriedRepository.findAll();
    }
}
