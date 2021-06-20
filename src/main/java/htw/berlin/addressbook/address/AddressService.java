package htw.berlin.addressbook.address;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAddresses() {
       return addressRepository.findAll();
    }

    public void addNewAddress(Address address) {
        addressRepository.save(address);
    }

    public void deleteAddress(Long addressId) {
        boolean exists = addressRepository.existsById(addressId);
        if (!exists){
            throw new IllegalStateException(
                    "address with id " + addressId + "does not exists");

        }

        addressRepository.deleteById(addressId);
    }

   /** @Transactional
    public void updateAddress(Long addressId,
                              String name,
                              String email){
        Address address = addressRepository.findById(addressId).orElseThrow() -> new IllegalStateException(
                "address with id " + addressId + " does not exist");

        if (name != null && name.length() > 0 && !Objects.equals(address.getName(),name)){
            address.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(address.getEmail(), email)){
            Optional<Address> addressOptional = addressRepository.findAddressByEmail(email);
            if(addressOptional.isPresent()){
                throw new IllegalStateException("Email taken");
            }
            address.setEmail(email);
        }
    } **/
}
