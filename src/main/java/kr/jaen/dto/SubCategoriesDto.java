package kr.jaen.dto;

import kr.jaen.domain.SubCategories;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SubCategoriesDto {
    private int subcategory_id;
    private String name;
    private int categoryId;

    public SubCategories toEntity(){
        return SubCategories.builder()
                .subcategory_id(subcategory_id)
                .name(name)
                .categoryId(categoryId)
                .build();
    }
}
