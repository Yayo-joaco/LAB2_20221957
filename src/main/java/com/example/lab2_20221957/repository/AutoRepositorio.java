package com.example.lab2_20221957.repository;
import com.example.lab2_20221957.entity.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutoRepositorio extends JpaRepository<Auto, Integer> {

}
