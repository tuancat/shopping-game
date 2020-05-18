package vn.ecoe.pigame.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TradingDTO implements Serializable {

    private static final long serialVersionUID = -6269217465868215007L;

    private Long id;

    private String name;
}
