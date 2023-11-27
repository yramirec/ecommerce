package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Price;
import com.example.ecommerce.exception.DataNotFoundException;
import com.example.ecommerce.model.PriceResponse;
import com.example.ecommerce.repository.PriceRepository;
import com.example.ecommerce.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }


    @Override
    public PriceResponse getPrice(LocalDateTime applicationDate, Long productId, Long brandId) {

        List<Price> applicablePrices = priceRepository.findByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
                brandId, productId, applicationDate, applicationDate);

        if (applicablePrices.isEmpty()) {
            throw new DataNotFoundException("No se encontraron datos para los parámetros proporcionados.");
        }

        Price selectedPrice = applicablePrices.get(0);

        return new PriceResponse(
                selectedPrice.getProductId(),
                selectedPrice.getBrandId(),
                selectedPrice.getPriceList(),
                selectedPrice.getStartDate(),
                selectedPrice.getEndDate(),
                selectedPrice.getPrice(),
                selectedPrice.getCurrency()
        );
    }
}