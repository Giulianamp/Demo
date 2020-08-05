package com.example.demo.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GallinaDao extends CrudRepository<Gallina, Long>{

}
