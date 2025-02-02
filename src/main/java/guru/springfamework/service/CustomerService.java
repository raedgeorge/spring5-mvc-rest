package guru.springfamework.service;

import guru.springfamework.api.v1.model.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAllCustomers();
    CustomerDTO findCustomerById(int id);
    CustomerDTO createNewCustomer(CustomerDTO customerDTO);

}
