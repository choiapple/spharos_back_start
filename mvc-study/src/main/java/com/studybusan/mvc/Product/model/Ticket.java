package com.studybusan.mvc.Product.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Ticket extends Product{
    private Date startDate;
    private Date endDate;
    private String seatNumber;
}
