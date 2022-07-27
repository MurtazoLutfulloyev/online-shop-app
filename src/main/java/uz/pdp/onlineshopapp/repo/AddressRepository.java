package uz.megashop.onlineshopapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.megashop.onlineshopapp.domain.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
