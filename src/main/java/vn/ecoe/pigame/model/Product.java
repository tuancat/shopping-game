package vn.ecoe.pigame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity
@Data
public class Product implements Serializable {


    private static final long serialVersionUID = -1085813353116364106L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "branch", nullable = false, length = 255)
    private String branch;
    @Column(name = "color", nullable = false, length = 255)
    private String color;
    @ManyToOne
    @JoinColumn(name = "categoriesid")
    private Categories categories;


}
