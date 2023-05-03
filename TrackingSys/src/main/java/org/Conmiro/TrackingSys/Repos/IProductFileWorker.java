package org.Conmiro.TrackingSys.Repos;

import org.Conmiro.TrackingSys.Models.ProductModel;

import java.util.List;

public interface IProductFileWorker {
    public List<ProductModel> getClientData();
    public ProductModel findClientById(long id);
    public void add(ProductModel ClientData);
    public void update(ProductModel ClientData);
    public void delete(long id);
}
