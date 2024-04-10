package kr.jaen.dto;

import kr.jaen.domain.Class;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ClassDto {

    private int index;
    private String title;
    private int categoryId;
    private int subcategory_id;
    private int level;
    private String description;
    private String duration;
    private String environment;
    private String target;
    private String background;
    private String goal;
    private String technology_stack;

    public Class toEntity(){
        return Class.builder()
                .index(index)
                .title(title)
                .categoryId(categoryId)
                .subcategory_id(subcategory_id)
                .level(level)
                .description(description)
                .duration(duration)
                .environment(environment)
                .target(target)
                .background(background)
                .goal(goal)
                .technology_stack(technology_stack)
                .build();
    }
}
