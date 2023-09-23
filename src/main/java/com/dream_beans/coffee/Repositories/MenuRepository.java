package com.dream_beans.coffee.Repositories;
import com.dream_beans.coffee.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {
}