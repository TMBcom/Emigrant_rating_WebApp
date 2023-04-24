package org.Conmiro.TrackingSys.Controllers;

import lombok.RequiredArgsConstructor;
import org.Conmiro.TrackingSys.Service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "products";
    }

}
