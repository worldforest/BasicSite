package kr.jaen.history.service;

import kr.jaen.history.domain.History;
import kr.jaen.history.dto.AddHistoryRequest;
import kr.jaen.history.repository.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HistoryService {
    private final HistoryRepository historyRepository;

    public History save(AddHistoryRequest request){
        return historyRepository.save(request.toEntity());
    }
}
