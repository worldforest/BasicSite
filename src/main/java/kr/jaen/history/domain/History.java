package kr.jaen.history.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;

@Entity
@Table(name="history")//클래스 이름이 테이블 이름
@Getter
@Setter
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
    @Column(name="year", updatable = false)
    private Year year;

    @Builder
    public History(int index, String companyname, String classname, Year year) {
        this.index = index;
        this.companyname = companyname;
        this.classname = classname;
        this.year = year;
    }
}
