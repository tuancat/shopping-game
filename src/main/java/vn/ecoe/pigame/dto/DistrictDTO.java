package vn.ecoe.pigame.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class DistrictDTO implements Serializable {

    private static final long serialVersionUID = 8627282363185272016L;

    private Long id;

    private String name;

    private Long idDistrict;
}
