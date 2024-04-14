package kr.jaen.controller;

import kr.jaen.domain.*;
import kr.jaen.domain.Class;
import kr.jaen.dto.HistoryDto;
import kr.jaen.service.*;
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
private final CurriculumService curriculumService;

    @GetMapping("/class/category")
    public List<Class> getClassByCategory(@RequestParam Integer categoryId){
        System.out.println(">>> category_id: "+categoryId);
        List<Class> classByCategory = classService.findByCategoryId(categoryId);
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

    @GetMapping("/curriculum")
    public List<Curriculum> getCurriculumByCategoryId(@RequestParam Integer classId){
        List<Curriculum> selectedCurriculum = curriculumService.findByClassId(classId);
        return selectedCurriculum;
    }

}