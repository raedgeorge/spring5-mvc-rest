package guru.springfamework.api.v1.model;

import lombok.Data;

@Data
public class CustomerDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String customerUrl;
}
