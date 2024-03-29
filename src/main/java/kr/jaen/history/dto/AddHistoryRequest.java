package kr.jaen.history.dto;

import kr.jaen.history.domain.History;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddHistoryRequest {
    private String companyname;
    private String classname;

    public History toEntity(){
        return History.builder()
                .companyname(companyname)
                .classname(classname).build();
    }
}
