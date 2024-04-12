package kr.jaen.dto;

import kr.jaen.domain.SubCategory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryDto {
    private int subcategory_id;
    private String name;
    private int categoryId;

    public SubCategory toEntity(){
        return SubCategory.builder()
                .subcategory_id(subcategory_id)
                .name(name)
                .categoryId(categoryId)
                .build();
    }
}
