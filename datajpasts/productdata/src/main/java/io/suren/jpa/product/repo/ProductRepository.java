package io.suren.jpa.product.repo;

import org.springframework.data.repository.CrudRepository;

import io.suren.jpa.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
