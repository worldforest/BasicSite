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
    public List<Class> getAllClass(){
        return classRepository.findAll();
    }
}
