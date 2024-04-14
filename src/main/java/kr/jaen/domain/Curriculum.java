package kr.jaen.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "curriculum")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Curriculum {

    @Id
    @Column(name = "curriculumId", updatable = false)
    private int curriculumId;

    @Column(name = "classId", updatable = false)
    private int classId;
    @Column(name = "sequenceNum", updatable = false)
    private int sequenceNum;
    @Column(name = "title", updatable = false)
    private String title;
    @Column(name = "description", updatable = false)
    private String description;

    @Builder
    public Curriculum(int curriculumId, int classId, int sequenceNum, String title, String description){
        this.curriculumId = curriculumId;
        this.classId = classId;
        this.sequenceNum = sequenceNum;
        this.title = title;
        this.description = description;
    }
}
