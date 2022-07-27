package uz.megashop.onlineshopapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.megashop.onlineshopapp.domain.Customer;
import uz.megashop.onlineshopapp.domain.enums.RolesEnum;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByUsername(String username);


}
