package org.Conmiro.TrackingSys.Service;

import org.Conmiro.TrackingSys.Models.ProductModel;
import org.Conmiro.TrackingSys.Repos.IProductFileWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductFileWorker ProductDataRepository;
    @Async
    public List<ProductModel> listProducts(){
        return ProductDataRepository.getClientData();}

    @Async
    public void saveProduct(ProductModel product){
        ProductDataRepository.add(product);
    }
    @Async
    public void deleteProducts(long id){
        ProductDataRepository.delete(id);
    }

    @Async
    public ProductModel getProductById(long id){
        return ProductDataRepository.findClientById(id);
    }
    @Async
    public void updateProduct(ProductModel product){
        ProductDataRepository.update(product);
    }
}
