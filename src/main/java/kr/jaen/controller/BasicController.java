package kr.jaen.controller;

import kr.jaen.domain.Categories;
import kr.jaen.domain.History;
import kr.jaen.domain.Class;
import kr.jaen.dto.HistoryDto;
import kr.jaen.service.CategoriesService;
import kr.jaen.service.ClassService;
import kr.jaen.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
//@RequestMapping("/api")
public class BasicController {

private final HistoryService historyService;
private final ClassService classService;
private final CategoriesService categoriedService;

    @GetMapping("/jaen/class/category")
    public List<Class> getClassByCategory(@RequestParam Integer categoryId){
        System.out.println(">>> category_id: "+categoryId);
        List<Class> classByCategory = classService.findByCategoryId(categoryId);
        System.out.println(">>> 가지고 왔는가?");
        return classByCategory;
    }

    @GetMapping("/jaen/class")
    public List<Class> getAllClass(){
        List<Class> allClass = classService.getAllClass();
        return allClass;
    }
    @GetMapping("/jaen/categories")
    public List<Categories> getAllCategories(){
        List<Categories> allCategories = categoriedService.getAllCategories();
        return allCategories;
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