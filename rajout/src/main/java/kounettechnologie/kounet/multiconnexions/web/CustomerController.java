package kounettechnologie.kounet.multiconnexions.web;

import jakarta.websocket.server.PathParam;
import kounettechnologie.kounet.multiconnexions.entity.Customer;
import kounettechnologie.kounet.multiconnexions.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
@GetMapping("/customer")
    public List<Customer> customerList(){
    return customerRepository.findAll();
}

    @GetMapping("/customer/{id}")
    public Customer customer(@PathVariable long id){
        return customerRepository.findById(id).get();
    }

    @PostMapping("/savecustomer")
    public Customer savecustomer(@RequestBody Customer customer){
      customerRepository.save(customer);
      return customer;
    }



}

