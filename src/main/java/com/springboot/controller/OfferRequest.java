package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferRequest {
    private int restaurant_id;
    private String offer_type;
    private int offer_value;

    private List<String> customer_segment;
}
