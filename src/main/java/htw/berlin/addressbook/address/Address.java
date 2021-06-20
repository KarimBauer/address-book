package htw.berlin.addressbook.address;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Address {
    @Id
    @SequenceGenerator(
            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "address_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String homeAddress;

    public Address(){

    }

    public Address(Long id,String name,String email,String homeAddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.homeAddress = homeAddress;

    }

    public Address(String name,String email,String homeAddress) {

        this.name = name;
        this.email = email;
        this.homeAddress = homeAddress;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", homeAddress='" + homeAddress +
                '}';
    }
}
