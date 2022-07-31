package uz.pdp.onlineshopapp.dto;

import lombok.Data;
import uz.pdp.onlineshopapp.domain.AttachmentContent;
import uz.pdp.onlineshopapp.domain.Discount;

@Data
public class ProductDTO {

    private Long id;

    private String name;

    private String title;

    private String description;

    private double price;

    private int quantity;

    private String color;

    private String size;

    private Discount discount;

    private AttachmentContent attachmentContent;

}
