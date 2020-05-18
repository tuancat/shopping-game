package vn.ecoe.pigame.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class BuyerDTO implements Serializable {
    private String id;

    private String firstName;

    private String lastName;

    private String name;

    private Date dateOfBirth;

    private String idCard;

    private String phoneNumber;
}
