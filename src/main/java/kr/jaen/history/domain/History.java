package kr.jaen.history.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="index", updatable = false)
    private int index;
    @Column(name="companyname", updatable = false)
    private String companyname;
    @Column(name="classname", updatable = false)
    private String classname;

    @Builder
    public History(int index, String companyname, String classname) {
        this.companyname = companyname;
        this.classname = classname;
    }
}
