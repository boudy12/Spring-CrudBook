package com.boudy.crudbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boudy.crudbook.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}






