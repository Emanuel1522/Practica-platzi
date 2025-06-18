package com.practica.platzi.domain.repository;

import com.practica.platzi.domain.model.Purchase;
import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
