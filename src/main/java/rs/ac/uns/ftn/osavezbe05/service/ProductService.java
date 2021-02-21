package rs.ac.uns.ftn.osavezbe05.service;

import rs.ac.uns.ftn.osavezbe05.model.entity.Product;

import java.util.List;

public interface ProductService {

    Product findOne(Integer productId);

    List<Product> findAll();

    Product save(Product product);

    void remove(Integer id);

}
