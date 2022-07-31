package uz.pdp.onlineshopapp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.onlineshopapp.dto.ProductDTO;
import uz.pdp.onlineshopapp.dto.ResponseData;

@Service
public interface ProductService {
    ResponseEntity<ResponseData> addProduct(ProductDTO productDTO);
}
