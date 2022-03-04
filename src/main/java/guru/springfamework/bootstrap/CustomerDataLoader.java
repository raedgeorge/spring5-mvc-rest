package guru.springfamework.bootstrap;

import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerDataLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public CustomerDataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer raed = new Customer();
        raed.setFirstName("raed");
        raed.setLastName("george");

        Customer george = new Customer();
        george.setFirstName("george");
        george.setLastName("abu sada");

        Customer joyce = new Customer();
        joyce.setFirstName("joyce");
        joyce.setLastName("abu sada");

        customerRepository.save(raed);
        customerRepository.save(joyce);
        customerRepository.save(george);

        log.info("Loaded Customers : " + customerRepository.count() );
    }
}
