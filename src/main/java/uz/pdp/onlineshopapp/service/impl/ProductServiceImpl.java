package uz.megashop.onlineshopapp.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.megashop.onlineshopapp.domain.Product;
import uz.megashop.onlineshopapp.dto.ProductDTO;
import uz.megashop.onlineshopapp.dto.ResponseData;
import uz.megashop.onlineshopapp.repo.ProductRepository;
import uz.megashop.onlineshopapp.service.ProductService;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<ResponseData> addProduct(ProductDTO productDTO) {

        ResponseData<ProductDTO> result = new ResponseData<>();
        Product product = new Product();
        product.setColor(productDTO.getColor());
        product.setAttachmentContent(productDTO.getAttachmentContent());
        product.setDescription(productDTO.getDescription());
        product.setDiscount(productDTO.getDiscount());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());
        product.setSize(productDTO.getSize());
        product.setTitle(productDTO.getTitle());
        product.setCreatedAt(LocalDateTime.now());
        productRepository.save(product);
        result.setMessage("added");
        result.setSuccess(true);
        return ResponseEntity.ok(result);

    }
}
