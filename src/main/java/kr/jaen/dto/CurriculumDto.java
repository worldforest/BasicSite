package kr.jaen.dto;

import kr.jaen.domain.Curriculum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CurriculumDto {


    private int curriculumId;
    private int classId;
    private int sequenceNum;
    private String title;
    private String description;

    public Curriculum toEntity(){
        return Curriculum.builder()
                .curriculumId(curriculumId)
                .classId(classId)
                .sequenceNum(sequenceNum)
                .title(title)
                .description(description)
                .build();
    }

}
