package lk.acpt.demo.afsd.repo;

import lk.acpt.demo.afsd.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

   // Customer findByEmail(String email);



    Optional<Customer> findByEmail(String email);
}
