package uz.pdp.onlineshopapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.onlineshopapp.domain.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
