package kr.jaen.service;

import kr.jaen.domain.History;
import kr.jaen.dto.HistoryDto;
import kr.jaen.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HistoryService {
    private final HistoryRepository historyRepository;

    public History save(HistoryDto request){
        return historyRepository.save(request.toEntity());
    }
    public List<History> getAll(){
        return historyRepository.findAll();
    }
}