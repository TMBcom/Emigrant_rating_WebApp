package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.ProductModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<ProductModel> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new ProductModel(++ID,"PS5", "SimpleDimple", 6700, "Moscow", "Petia"));
        products.add(new ProductModel(++ID,"Battery", "Dimple", 200, "Peter", "Ivan"));
    }

    public List<ProductModel> listProducts(){return products;}

    public void saveProduct(ProductModel product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProducts(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

}
