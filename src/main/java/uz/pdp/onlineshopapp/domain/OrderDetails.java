package uz.megashop.onlineshopapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.megashop.onlineshopapp.domain.enums.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "order_status",nullable = false)
    private OrderStatus orderStatus;

    @Column(name = "total_price", nullable = false)
    private double totalPrice;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Payment payment;

    @ManyToOne
    private Product product;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modifed_at")
    private LocalDateTime modifedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

}
