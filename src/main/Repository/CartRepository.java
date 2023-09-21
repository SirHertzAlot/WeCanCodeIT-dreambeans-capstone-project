package com.dream_beans.coffee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {

}