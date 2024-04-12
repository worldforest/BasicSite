package kr.jaen.dto;

import kr.jaen.domain.Category;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private int category_id;
    private String name;

    public Category toEntity(){
        return Category.builder()
                .category_id(category_id)
                .name(name)
                .build();
    }
}
