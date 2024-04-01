package kr.jaen.history.dto;

import kr.jaen.history.domain.History;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Year;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddHistoryRequest {
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
