package com.springboot.controller;

import lombok.Data;

import java.util.List;
@Data

public class OfferRequest {
    private int restaurant_id;
    private String offer_type;
    private int offer_value;

    private List<String> customer_segment;
}
