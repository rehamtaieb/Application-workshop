package org.example.workshopapplication.repositories;
import org.example.workshopapplication.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}