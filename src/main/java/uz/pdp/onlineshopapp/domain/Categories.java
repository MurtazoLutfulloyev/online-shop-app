package uz.megashop.onlineshopapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.megashop.onlineshopapp.domain.enums.CustomerType;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "product_categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_type")
    private CustomerType customerType;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modifed_at")
    private LocalDateTime modifedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;


}
