package com.easytobuy;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "category-service",path = "/api/category")
public interface CategoryFeignProxy {
	@GetMapping("/categoryName/{categoryName}")
	Optional<Category> findByCategoryName(@PathVariable String categoryName);
}
