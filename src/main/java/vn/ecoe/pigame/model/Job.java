package vn.ecoe.pigame.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table
@Entity
public class Job implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
