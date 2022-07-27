package uz.megashop.onlineshopapp.dto;

import lombok.Data;
import uz.megashop.onlineshopapp.domain.AttachmentContent;
import uz.megashop.onlineshopapp.domain.Discount;

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
