package com.springboot.controller;

import lombok.Data;

@Data
public class ApplyOfferRequest {
    private int cart_value;
    private int restaurant_id;
    private int user_id;
}
