package ar.edu.ap.portfolio.service.impl;

import ar.edu.ap.portfolio.dto.AddressDto;
import ar.edu.ap.portfolio.entity.Address;
import ar.edu.ap.portfolio.exception.ParamNotFound;
import ar.edu.ap.portfolio.mapper.AddressMapper;
import ar.edu.ap.portfolio.repository.AddressRepository;
import ar.edu.ap.portfolio.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository repository;

    @Autowired
    private AddressMapper mapper;

    public List<Address> getAddresses() {
        List<Address> addresses = repository.findAll();
        if(addresses.isEmpty()){
            throw new ParamNotFound("No se encuentran los atributos requeridos");
        }
        return addresses;
    }

    public Address save(Address address) {
        return repository.save(address);
    }

    public Address update(Long id, AddressDto dto) {
        Optional<Address> response = repository.findById(id);
        if (!response.isPresent()){
            throw new ParamNotFound("No se encuentra el id" + id);
        }
        Address address = response.get();
        Address updatedAddress = mapper.updateAddressFromAddressDto(dto, address);
        return repository.save(updatedAddress);
    }

    public void delete(Long id) {
        Optional<Address> response = repository.findById(id);
        if (!response.isPresent()){
            throw new ParamNotFound("No se encuentra el id" + id);
        }
        repository.deleteById(id);
    }
}
