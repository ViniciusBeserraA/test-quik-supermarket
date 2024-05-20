package com.supermarket.supermarket.Controller;
import com.supermarket.supermarket.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("/")
    public ResponseEntity<String> list() {
        String res = productsService.list();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> listById(@PathVariable String id) {
        String res = productsService.listById(id);
        return ResponseEntity.ok(res);
    }

}
