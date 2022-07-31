package uz.pdp.onlineshopapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.onlineshopapp.domain.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
