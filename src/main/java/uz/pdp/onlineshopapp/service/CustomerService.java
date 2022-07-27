package uz.megashop.onlineshopapp.service;

import org.springframework.stereotype.Service;
import uz.megashop.onlineshopapp.domain.Customer;
import uz.megashop.onlineshopapp.domain.Role;
import uz.megashop.onlineshopapp.domain.enums.RolesEnum;

import java.util.List;

@Service
public interface CustomerService {

    Customer saveCustomer(Customer customer);
    Role saveRole(Role role);

    void  addRoleToCustomer(String username, String roleName);

    Customer getCustomer(String username);

    List<Customer> getCustomers();
}
