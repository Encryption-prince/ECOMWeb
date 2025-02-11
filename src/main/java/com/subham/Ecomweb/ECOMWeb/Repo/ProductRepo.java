package com.subham.Ecomweb.ECOMWeb.Repo;

import com.subham.Ecomweb.ECOMWeb.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
