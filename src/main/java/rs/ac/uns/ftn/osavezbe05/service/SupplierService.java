package rs.ac.uns.ftn.osavezbe05.service;

import rs.ac.uns.ftn.osavezbe05.model.entity.Supplier;

import java.util.List;

public interface SupplierService {

    Supplier findOne(Integer supplierId);

    List<Supplier> findAll();

    Supplier save(Supplier supplier);

    void remove(Integer id);

}
