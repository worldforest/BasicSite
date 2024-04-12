package kr.jaen.controller;

import kr.jaen.domain.Category;
import kr.jaen.domain.Class;
import kr.jaen.domain.History;
import kr.jaen.domain.SubCategory;
import kr.jaen.dto.HistoryDto;
import kr.jaen.service.CategoryService;
import kr.jaen.service.ClassService;
import kr.jaen.service.HistoryService;
import kr.jaen.service.SubCategoryService;
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
private final CategoryService categoryService;
private final SubCategoryService subCategoryService;

    @GetMapping("/class/category")
    public List<Class> getClassByCategory(@RequestParam Integer categoryId){
        System.out.println(">>> category_id: "+categoryId);
        List<Class> classByCategory = classService.findByCategoryId(categoryId);
        System.out.println(">>> 가지고 왔는가?");
        return classByCategory;
    }

    @GetMapping("/class/subcategory")
    public List<Class> getClassBySubcategory(@RequestParam Integer subcategoryId){
        List<Class> classBySubCategory = classService.findBySubcategoryId(subcategoryId);
        return classBySubCategory;
    }

    @GetMapping("/class")
    public List<Class> getAllClass(){
        List<Class> allClass = classService.getAll();
        return allClass;
    }
    
    // 대분류 전체 카테고리
    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        List<Category> allCategories = categoryService.getAll();
        return allCategories;
    }

    @GetMapping("/subcategories")
    public List<SubCategory> getAllSubCategories(){
        List<SubCategory> allSubCategories = subCategoryService.getAll();
        return allSubCategories;
    }

    @GetMapping("/subcategory")
    public List<SubCategory> getSubCategoryByCategoryId(@RequestParam Integer categoryId){
        System.out.println("선택된 categoryId: "+categoryId);
        List<SubCategory> selectedSubCategories = subCategoryService.findByCategoryId(categoryId);
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