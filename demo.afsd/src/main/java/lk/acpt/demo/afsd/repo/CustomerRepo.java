package lk.acpt.demo.afsd.repo;

import lk.acpt.demo.afsd.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {




}
