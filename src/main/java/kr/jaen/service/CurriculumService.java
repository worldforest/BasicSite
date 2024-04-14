package kr.jaen.service;

import kr.jaen.domain.Curriculum;
import kr.jaen.repository.CurriculumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CurriculumService {
    private final CurriculumRepository curriculumRepository;

    public List<Curriculum> findByClassId(Integer classId){
        return curriculumRepository.findByClassId(classId);
    }

}
