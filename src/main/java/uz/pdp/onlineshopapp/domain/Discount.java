package uz.megashop.onlineshopapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "discounts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(name = "discount_persent", nullable = false)
    private double discountPersent;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "modifed_by")
    private String modifedBy;

    @Column(name = "deleted_by")
    private String deletedBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modifed_at")
    private LocalDateTime modifedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;




}
