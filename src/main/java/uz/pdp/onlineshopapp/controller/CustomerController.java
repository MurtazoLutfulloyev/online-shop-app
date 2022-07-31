package uz.pdp.onlineshopapp.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.pdp.onlineshopapp.domain.Customer;
import uz.pdp.onlineshopapp.domain.Role;
import uz.pdp.onlineshopapp.service.CustomerService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

     @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getCustomers(){

       return ResponseEntity.ok().body(customerService.getCustomers());
    }
    @PostMapping("/customer/saves")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/customer/save").toUriString());
       return ResponseEntity.created(uri).body(customerService.saveCustomer(customer));
    }
    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/addToCustomer").toUriString());
       return ResponseEntity.created(uri).body(customerService.saveRole(role));
    }

}
