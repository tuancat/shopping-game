package vn.ecoe.pigame.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class JobDTO implements Serializable {


    private static final long serialVersionUID = -3030360038641325019L;

    private Long id;

    private String name;
}
