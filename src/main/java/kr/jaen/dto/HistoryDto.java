package kr.jaen.dto;

import kr.jaen.domain.History;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Year;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HistoryDto {
    private int index;
    private String companyname;
    private String classname;
    private Year year;
//
    public History toEntity(){
        return History.builder()
                .index(index)
                .companyname(companyname)
                .classname(classname)
                .year(year).build();
    }
}
