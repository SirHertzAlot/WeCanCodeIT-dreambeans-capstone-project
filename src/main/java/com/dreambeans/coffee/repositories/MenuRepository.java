package com.dreambeans.coffee.repositories;

import com.dreambeans.coffee.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {
    Menu findByName(String name);
}