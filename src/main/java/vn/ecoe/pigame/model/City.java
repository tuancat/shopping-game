package vn.ecoe.pigame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Table
@Entity
public class City implements Serializable {

    private static final long serialVersionUID = 7644571972146134683L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<District> listDistrict;

}
