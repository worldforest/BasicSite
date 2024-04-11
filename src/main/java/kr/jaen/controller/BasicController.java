package kr.jaen.controller;

import kr.jaen.domain.Categories;
import kr.jaen.domain.Class;
import kr.jaen.domain.History;
import kr.jaen.domain.SubCategories;
import kr.jaen.dto.HistoryDto;
import kr.jaen.service.CategoriesService;
import kr.jaen.service.ClassService;
import kr.jaen.service.HistoryService;
import kr.jaen.service.SubCategoriesService;
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
private final SubCategoriesService subCategoriesService;

    @GetMapping("/jaen/class/category")
    public List<Class> getClassByCategory(@RequestParam Integer categoryId){
        System.out.println(">>> category_id: "+categoryId);
        List<Class> classByCategory = classService.findByCategoryId(categoryId);
        System.out.println(">>> 가지고 왔는가?");
        return classByCategory;
    }

    @GetMapping("/jaen/class")
    public List<Class> getAllClass(){
        List<Class> allClass = classService.getAll();
        return allClass;
    }
    
    // 대분류 전체 카테고리
    @GetMapping("/jaen/categories")
    public List<Categories> getAllCategories(){
        List<Categories> allCategories = categoriedService.getAll();
        return allCategories;
    }

    @GetMapping("/jaen/subcategories")
    public List<SubCategories> getAllSubCategories(){
        List<SubCategories> allSubCategories = subCategoriesService.getAll();
        return allSubCategories;
    }

    @GetMapping("/subcategory")
    public List<SubCategories> getSubCategoryByCategoryId(@RequestParam Integer categoryId){
        System.out.println("선택된 categoryId: "+categoryId);
        List<SubCategories> selectedSubCategories = subCategoriesService.findByCategoryId(categoryId);
        return selectedSubCategories;
    }


    @PostMapping("/historySave")
    public ResponseEntity<History> addHistory(@RequestBody HistoryDto request){

        History savedHistory = historyService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHistory);
    }

    @GetMapping("/history")
    public List<History> readHistory(){

        List<History> allHistory = historyService.getAll();
        return allHistory;
    }
}