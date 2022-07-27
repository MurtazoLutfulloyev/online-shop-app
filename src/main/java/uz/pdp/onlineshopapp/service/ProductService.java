package uz.megashop.onlineshopapp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.megashop.onlineshopapp.dto.ProductDTO;
import uz.megashop.onlineshopapp.dto.ResponseData;

@Service
public interface ProductService {
    ResponseEntity<ResponseData> addProduct(ProductDTO productDTO);
}
