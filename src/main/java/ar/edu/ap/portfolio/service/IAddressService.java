package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.dto.AddressDto;
import ar.edu.ap.portfolio.entity.Address;

import java.util.List;

public interface IAddressService {

    List<Address> getAddresses();
    Address save(Address address);
    Address update(Long id, AddressDto dto);
    void delete(Long id);
}
