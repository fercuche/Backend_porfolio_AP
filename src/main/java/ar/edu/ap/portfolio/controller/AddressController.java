package ar.edu.ap.portfolio.controller;

import ar.edu.ap.portfolio.dto.AddressDto;
import ar.edu.ap.portfolio.entity.Address;
import ar.edu.ap.portfolio.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAll(){
        List<Address> addresses = addressService.getAddresses();
        return ResponseEntity.status(HttpStatus.OK).body(addresses);
    }

    @PostMapping
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        Address response = addressService.save(address);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Address> updateAddress(@PathVariable Long id, @RequestBody AddressDto dto){
        Address response = addressService.update(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id){
        addressService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
