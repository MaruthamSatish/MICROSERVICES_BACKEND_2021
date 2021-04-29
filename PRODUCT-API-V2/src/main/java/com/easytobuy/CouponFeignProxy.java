package com.easytobuy;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "coupon-service",path = "/api/coupon")
public interface CouponFeignProxy {
    @GetMapping("/couponCode/{couponCode}")
	Optional<Coupon> findByCouponCode(@PathVariable String couponCode);
}
