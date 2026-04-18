package org.example.workshopapplication.services;
import org.example.workshopapplication.entities.Product;
import org.example.workshopapplication.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAll() { return repo.findAll(); }

    public Product save(Product p) { return repo.save(p); }
}