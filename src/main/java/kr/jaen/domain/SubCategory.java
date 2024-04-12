package kr.jaen.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="subcategories")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SubCategory {

    @Id
    @Column(name="subcategory_id", updatable = false)
    private int subcategory_id;
    @Column(name="name", updatable = false)
    private String name;
    @Column(name="categoryId", updatable = false)
    private int categoryId;

    @Builder
    public SubCategory(int subcategory_id, String name, int categoryId){
        this.subcategory_id= subcategory_id;
        this.name=name;
        this.categoryId=categoryId;
    }
}
