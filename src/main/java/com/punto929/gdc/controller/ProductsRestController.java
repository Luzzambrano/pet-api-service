package com.punto929.gdc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsRestController {
  public record Product(Long id, String name, String description){}

  @GetMapping()
  public List<Product> getAllProducts(){
    return List.of(new Product(Long.valueOf(12548), "Aguardiente", "Bebida columbiana"));
  }
}
