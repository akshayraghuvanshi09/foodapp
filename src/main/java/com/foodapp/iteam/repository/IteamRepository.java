package com.foodapp.iteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodapp.iteam.model.Item;
@Repository
public interface IteamRepository extends JpaRepository<Item, Integer>{

}
