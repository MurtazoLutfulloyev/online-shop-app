package uz.pdp.onlineshopapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double price;

    private int quantity;

    private String color;

    private String size;

    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Categories categories;

    @ManyToOne
    private AttachmentContent attachmentContent;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modifed_at")
    private LocalDateTime modifedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

}
