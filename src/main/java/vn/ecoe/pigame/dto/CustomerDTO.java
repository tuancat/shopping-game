package vn.ecoe.pigame.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class CustomerDTO implements Serializable {

    private static final long serialVersionUID = -5909189151540795909L;

    private String idCustomer;

    private String firstName;

    private String lastName;

    private String name;

    private Date dateOfBirth;

    private boolean isVietNam;

    private String idCity;

    private String idDistrict;

    private String phoneNumber;

    private String tradingId;

}
