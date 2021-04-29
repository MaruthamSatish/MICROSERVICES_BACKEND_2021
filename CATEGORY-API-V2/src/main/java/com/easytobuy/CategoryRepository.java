/**
 * 
 */
package com.easytobuy;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SatishReddy
 *
 */

public interface CategoryRepository  extends JpaRepository<Category,Long>{
	//sList<Category> findByCategoryName(String categoryName);
	Optional<Category> findByCategoryId(Integer categoryId);
	Optional<Category> findByCategoryName(String categoryName);
}
