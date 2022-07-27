package uz.megashop.onlineshopapp.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.megashop.onlineshopapp.domain.Customer;
import uz.megashop.onlineshopapp.domain.Role;
import uz.megashop.onlineshopapp.domain.enums.RolesEnum;
import uz.megashop.onlineshopapp.repo.CustomerRepository;
import uz.megashop.onlineshopapp.repo.RoleRepository;
import uz.megashop.onlineshopapp.service.CustomerService;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final RoleRepository roleRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        log.info("Saving new customer to the database");
        return customerRepository.save(customer);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role to the database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToCustomer(String username, String roleName) {

        Customer customerByUsername = customerRepository.findCustomerByUsername(username);
        Role roleByName = roleRepository.findRoleByName(roleName);

    }

    @Override
    public Customer getCustomer(String username) {
        log.info("Fetching customer {}", username);
        return customerRepository.findCustomerByUsername(username);

    }

    @Override
    public List<Customer> getCustomers() {
        log.info("Fetching all customers");
        return customerRepository.findAll();
    }
}
