package ar.edu.ap.portfolio.repository;

import ar.edu.ap.portfolio.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}