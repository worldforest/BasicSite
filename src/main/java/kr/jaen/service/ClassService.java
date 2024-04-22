package kr.jaen.service;

import kr.jaen.repository.ClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import kr.jaen.domain.Class;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassService {

    private final ClassRepository classRepository;
    public List<Class> getAll(){
        return classRepository.findAll();
    }

    // category별 강의목록 조회
    public List<Class> findByCategoryId(Integer categoryId) {
        return classRepository.findByCategoryId(categoryId);
    }
    public List<Class> findBySubcategoryId(Integer subcategoryId) {
        return classRepository.findBySubcategoryId(subcategoryId);
    }
    public List<Class> findByIndex(Integer index){
        return classRepository.findByIndex(index);
    }
}