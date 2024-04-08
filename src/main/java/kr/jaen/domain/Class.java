package kr.jaen.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "class")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Class {
    @Id
    @Column(name = "index", updatable = false)
    private int index;

    @Column(name = "title", updatable = false)
    private String title;
    @Column(name = "category_id", updatable = false)
    private int category_id;
    @Column(name = "subcategory_id", updatable = false)
    private int subcategory_id;
    @Column(name = "level", updatable = false)
    private int level;
    @Column(name = "description", updatable = false)
    private String description;
    @Column(name = "duration", updatable = false)
    private String duration;
    @Column(name = "environment", updatable = false)
    private String environment;
    @Column(name = "target", updatable = false)
    private String target;
    @Column(name = "background", updatable = false)
    private String background;
    @Column(name = "goal", updatable = false)
    private String goal;
    @Column(name = "technology_stack", updatable = false)
    private String technology_stack;

    @Builder
    public Class(int index,String title,int category_id,int subcategory_id,int level,String description,String duration,String environment,String target,String background,String goal,String technology_stack){
        this.index = index;
        this.title = title;
        this.category_id = category_id;
        this.subcategory_id = subcategory_id;
        this.level = level;
        this.description= description;
        this.duration=duration;
        this.environment=environment;
        this.target=target;
        this.background=background;
        this.goal=goal;
    }
}
