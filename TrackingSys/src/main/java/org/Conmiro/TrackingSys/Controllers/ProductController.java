package org.Conmiro.TrackingSys.Controllers;

import lombok.RequiredArgsConstructor;
import org.Conmiro.TrackingSys.Models.ProductModel;
import org.Conmiro.TrackingSys.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "products";
    }
    @PostMapping("/product/create")
    public String createProduct(ProductModel product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    
    public String deleteProduct(long id){

    }

}
