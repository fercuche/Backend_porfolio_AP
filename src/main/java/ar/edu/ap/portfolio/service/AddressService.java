package ar.edu.ap.portfolio.service;

import ar.edu.ap.portfolio.entity.Address;

public interface AddressService {


    Address getAddress();
    Address save(Address address);
    Address update(Long id, Address address);
    void delete(Long id);
}
