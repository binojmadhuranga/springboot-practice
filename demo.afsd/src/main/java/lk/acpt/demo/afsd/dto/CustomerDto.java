package lk.acpt.demo.afsd.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerDto {

    private int id;

    private String name;

    private double salary;

    private String email;

}
