package kr.jaen.dto;

import kr.jaen.domain.Categories;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class CategoriesDto {
    private int category_id;
    private String name;

    public Categories toEntity(){
        return Categories.builder()
                .category_id(category_id)
                .name(name)
                .build();
    }
}
