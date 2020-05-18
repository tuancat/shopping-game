package vn.ecoe.pigame.dto;

import lombok.Data;
import vn.ecoe.pigame.model.District;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class CityDTO implements Serializable {

    private static final long serialVersionUID = -7786627321566863805L;

    private Long id;

    private String name;

    private List<District> listDistrict;

}
