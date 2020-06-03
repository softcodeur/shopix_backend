package com.shopix.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shopix.beans.Commande;
import com.shopix.beans.User;
@RepositoryRestResource
public interface CommandeDao  extends JpaRepository<Commande, Long>{
  public Commande findByref(String ref);
  public Collection<Commande> findAllByUser(User user);
}
