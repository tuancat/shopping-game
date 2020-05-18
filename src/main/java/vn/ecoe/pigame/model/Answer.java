package vn.ecoe.pigame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity
@Data
public class Answer implements Serializable {

    private static final long serialVersionUID = 4238795241429680138L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String answer;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_question", nullable = false)
    private Question question;
}
