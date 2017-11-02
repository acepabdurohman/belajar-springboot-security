package com.acepabdurohman.belajar.belajarspringbootsecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "t_barang")
@Data
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal harga;

    private String nama;
}
