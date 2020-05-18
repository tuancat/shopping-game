package vn.ecoe.pigame.dto;

import lombok.Data;
import vn.ecoe.pigame.model.Categories;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class ProductDTO implements Serializable {


    private static final long serialVersionUID = 5282208676459930295L;
    private Long id;
    private String name;
    private Double price;
    private String branch;
    private String color;
}
