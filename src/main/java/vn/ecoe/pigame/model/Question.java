package vn.ecoe.pigame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table
public class Question implements Serializable {

    private static final long serialVersionUID = -700110383919911414L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String content;

    private String imageUrls;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> listAnswer;

}
