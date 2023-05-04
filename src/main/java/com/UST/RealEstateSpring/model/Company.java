package com.UST.RealEstateSpring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="realtor_data")
public class Company {
    @Id
    @GeneratedValue
    private Integer id;
    private String status;
    private Double bed;
    private Double bath;
    private Double acre_lot;
    private String city;
    private String state;
    @Column(name="zip_code")
    private Double zipcode;
    private String house_size;
    private String prev_sold_date;
    private Double price;
}
