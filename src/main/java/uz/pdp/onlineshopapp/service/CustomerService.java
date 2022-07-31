package uz.pdp.onlineshopapp.service;

import org.springframework.stereotype.Service;
import uz.pdp.onlineshopapp.domain.Customer;
import uz.pdp.onlineshopapp.domain.Role;

import java.util.List;

@Service
public interface CustomerService {

    Customer saveCustomer(Customer customer);
    Role saveRole(Role role);

    void  addRoleToCustomer(String username, String roleName);

    Customer getCustomer(String username);

    List<Customer> getCustomers();
}
