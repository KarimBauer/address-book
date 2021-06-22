package htw.berlin.addressbook.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService =  addressService;
    }

    @GetMapping
    public List<Address> getAddresses() {
        return addressService.getAddresses();
    }

    @PostMapping
    public void registerNewAddress(@RequestBody Address address){
        addressService.addNewAddress(address);
    }

    @DeleteMapping(path= "{addressId}")
    public void deleteAddress(@PathVariable("addressId")Long addressId){
        addressService.deleteAddress(addressId);
    }

    @RequestMapping(value = "/listaddresses", method = RequestMethod.GET)
    public String addressesTable(Model model){
        List<Address> addresses = addressService.getAddresses();
        model.addAttribute("addresses", addresses);
        return "getaddresses";
    }
    /**@PutMapping(path = "{addressId}")
    public void updateAddress(
            @PathVariable("addressId") Long addressId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        addressService.updateAddress(addressId,name, email);
    }
    }
    )**/


}
