package com.example.ecommerce.service;

import com.example.ecommerce.entity.Price;
import com.example.ecommerce.model.PriceResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public interface PriceService {
    public PriceResponse getPrice(LocalDateTime applicationDate, Long productId, Long brandId);
}
