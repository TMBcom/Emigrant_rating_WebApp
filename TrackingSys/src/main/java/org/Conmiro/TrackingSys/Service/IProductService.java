package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.ProductModel;

import java.util.List;

public interface IProductService {

    public List<ProductModel> listProducts();

    public void saveProduct(ProductModel product);


    public void deleteProducts(long id);

    public ProductModel getProductById(long id);

    public void updateProduct(ProductModel product);
}
