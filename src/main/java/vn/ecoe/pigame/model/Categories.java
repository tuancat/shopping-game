package vn.ecoe.pigame.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table
@Entity
@Data
public class Categories implements Serializable {

    private static final long serialVersionUID = -4275434439199301275L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @OneToMany(mappedBy = "categories", cascade = CascadeType.ALL)
    private List<Product> listProduct;


}
