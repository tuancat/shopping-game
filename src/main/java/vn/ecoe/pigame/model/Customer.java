package vn.ecoe.pigame.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class Customer extends Audit {

    private static final long serialVersionUID = 8720742012860427772L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String firstName;

    private String lastName;

    private String name;

    private Date dateOfBirth;

    private boolean isVietnamese;

    private long idCity;

    private long idDistrict;

    private String idCard;

    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "trading_id", nullable = false)
    private Trading trading;

}
