package kounettechnologie.kounet.multiconnexions.repository;

import kounettechnologie.kounet.multiconnexions.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
