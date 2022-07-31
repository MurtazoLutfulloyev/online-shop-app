package uz.pdp.onlineshopapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.onlineshopapp.dto.ProductDTO;
import uz.pdp.onlineshopapp.dto.ResponseData;
import uz.pdp.onlineshopapp.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ResponseData> addProduct(@RequestBody ProductDTO productDTO){

        return productService.addProduct(productDTO);
    }
}
