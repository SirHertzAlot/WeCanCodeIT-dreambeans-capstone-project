package com.dreambeans.coffee.controller;

import com.dreambeans.coffee.models.CustomerDto;
import com.dreambeans.coffee.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dreambeans.coffee.models.Customer;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class CustomerController extends CookieController{
    CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    /**
     * Use this to log users out.
     *
     * @return when successful returns 200, ok.
     */
    @GetMapping("/logout")
    public ResponseEntity<?> Logout(HttpServletRequest request){
        logout(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Use this function to log users in.
     * @param dto This is the customer object.
     * @param response If successful, response is 200, ok.
     * @return If not found response is 404, not found.
     */
    @PostMapping("/login")
    public ResponseEntity<?> Login(@RequestBody CustomerDto dto, HttpServletResponse response ){
        Customer customer = customerService.findByUserName(dto.getUserName());
        if(customer != null){
            if(dto.getPassword().equals(customer.getPassword())){
                AddCookie(customer,response);
                return new ResponseEntity<>(HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * This function registers customers.
     * @param dto This is the customer dto.
     * @return This returns the customer, if valid.
     */
    @PostMapping("/register")
    public ResponseEntity<Customer> Register(@RequestBody CustomerDto dto, HttpServletRequest request){
        logout(request);
        if(customerService.findByUserName(dto.getUserName()) == null){
            Customer customer = new Customer(dto.getUserName(),dto.getPassword());
            customerService.saveCustomer(customer);
            return ResponseEntity.status(HttpStatus.OK).body(customer);
        };
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    /**
     * This is a logged in customer.
     * @return It returns the customer.
     */
    @GetMapping("/customers")
    public ResponseEntity<Customer> getCust(HttpServletRequest request) {
        Customer customer = getCookieValue(request);
        if(customer==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.OK).body(customer);
    }

    /**
     * This is used to delete a customer.
     * Call the url inside of the GetMapping "" to invoke api for deleting by ID.
     * Pass in the ID at the end of the url.
     * @param id This is the customer ID.
     * @return It returns OK(HTTP 200) if it's in the DB.
     */
    @GetMapping("/customers/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id, HttpServletRequest request){
        Customer customer = getCookieValue(request);
        if(customer == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        customerService.deleteCustomerById(id);
         return new ResponseEntity<>(HttpStatus.OK);
    }
}