package kr.jaen.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="categories")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category {

    @Id
    @Column(name="category_id", updatable = false)
    private int category_id;
    @Column(name="name", updatable = false)
    private String name;

    @Builder
    public Category(int category_id, String name){
        this.category_id= category_id;
        this.name=name;
    }
}
