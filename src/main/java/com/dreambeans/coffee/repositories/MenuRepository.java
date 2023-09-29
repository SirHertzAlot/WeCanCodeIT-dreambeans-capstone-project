package com.dreambeans.coffee.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dreambeans.coffee.models.Menu;
import com.dreambeans.coffee.models.Product;


@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {

    void addProduct(Product product);
}