package htw.berlin.addressbook.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    //@Query("SELECT a FROM Address where a.email = ?1")
    //Optional<Address> findAddressByEmail(String email);
}
