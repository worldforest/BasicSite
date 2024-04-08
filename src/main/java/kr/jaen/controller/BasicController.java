package kr.jaen.controller;

import kr.jaen.domain.History;
import kr.jaen.domain.Class;
import kr.jaen.dto.HistoryDto;
import kr.jaen.service.ClassService;
import kr.jaen.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
//@RequestMapping("/api")
public class BasicController {

private final HistoryService historyService;
private final ClassService classService;

    @GetMapping("/jaen/class")
    public List<Class> getAllClass(){
        System.out.println(">>>Are you here?");
        List<Class> allClass = classService.getAllClass();
        System.out.println(">>> "+allClass.get(0));
        return allClass;
    }
    @PostMapping("/jaen/history")
    public ResponseEntity<History> addHistory(@RequestBody HistoryDto request){

        History savedHistory = historyService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHistory);
    }

    @GetMapping("/jaen")
    public List<History> readHistory(){

        System.out.println(">>>Are you here?");
        List<History> allHistory = historyService.getAllHistory(); 
        System.out.println(">>>>"+allHistory.get(0));
        return allHistory;
    }
}