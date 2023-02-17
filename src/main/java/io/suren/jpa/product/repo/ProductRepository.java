package io.suren.jpa.product.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.suren.jpa.product.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	List<Product> findByName(String name);
	
	
}
