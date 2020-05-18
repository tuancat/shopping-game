package vn.ecoe.pigame.dto;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class CategoriesDTO implements Serializable {

    private static final long serialVersionUID = 5633819073979936968L;
    private Long id;
    private String name;
}
