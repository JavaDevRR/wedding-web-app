package com.wedding.website.weddingwebapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HomeRepository extends CrudRepository<Home, Long>{

}
