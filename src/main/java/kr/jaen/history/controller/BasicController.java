package kr.jaen.history.controller;

import kr.jaen.history.domain.History;
import kr.jaen.history.dto.AddHistoryRequest;
import kr.jaen.history.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
//@RequestMapping("/api")
public class BasicController {

private final HistoryService historyService;

    @PostMapping("/jaen/history")
    public ResponseEntity<History> addHistory(@RequestBody AddHistoryRequest request){
        History savedHistory = historyService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHistory);
    }

}
