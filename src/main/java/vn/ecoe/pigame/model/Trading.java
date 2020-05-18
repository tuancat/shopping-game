package vn.ecoe.pigame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class Trading implements Serializable {

    private static final long serialVersionUID = -6269217465868215007L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
