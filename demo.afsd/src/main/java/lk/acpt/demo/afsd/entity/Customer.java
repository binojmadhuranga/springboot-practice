package lk.acpt.demo.afsd.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {


    @Id
    private int id;

    private String name;

    private  double salary;

    private String email;



}
