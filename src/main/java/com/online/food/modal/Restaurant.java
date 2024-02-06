package com.online.food.modal;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_restaurant")
@Builder
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantId;
    @Column(name = "restaurant_name")
    private String restaurantName;
    @Column(name = "phone_number")
    private Long restaurantPhoneNumber;

    @Column(name = "restaurant_address",length = 2000)
    private String restaurantAddress;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
