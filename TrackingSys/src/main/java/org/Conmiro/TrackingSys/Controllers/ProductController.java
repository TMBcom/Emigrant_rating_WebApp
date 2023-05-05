package org.Conmiro.TrackingSys.Controllers;

import lombok.RequiredArgsConstructor;
import org.Conmiro.TrackingSys.Models.ProductModel;
import org.Conmiro.TrackingSys.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/product/{id}")
    public String productInfo(@PathVariable long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }
    @PostMapping("/product/create")
    public String createProduct(ProductModel product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("product/delete/{id}")
    public String deleteProduct(@PathVariable long id, ProductModel product){
        productService.deleteProducts(id);
        return "redirect:/";
    }

}
