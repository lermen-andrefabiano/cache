package com.ehcache.ehcache;

import lombok.extern.java.Log;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Log
public class NumberService {

    @Cacheable(
            value = "squareCache",
            key = "#number",
            condition = "#number>10")
    public BigDecimal square(Long number) {
        BigDecimal square = BigDecimal.valueOf(number).multiply(BigDecimal.valueOf(number));
        log.info(String.format("square of %s is %s", number, square));
        return square;
    }
}