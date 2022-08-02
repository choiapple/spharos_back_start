package com.studybusan.mvc.Product.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@Entity
public class Clothes extends Product{

    private String size;
    private String Color;

}
