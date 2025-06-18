package com.practica.platzi.domain.service;

import com.practica.platzi.domain.model.Product;
import com.practica.platzi.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productoId) {
        return productRepository.getProduct(productoId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Optional<List<Product>> getScarseProducts(int quantity, boolean active) {
        return productRepository.getScarseProducts(quantity, active);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(prod -> {
            productRepository.delete(prod.getProductId());
            return true;
        }).orElse(false);
    }
}
