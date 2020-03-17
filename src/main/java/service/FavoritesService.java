package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.Favorites;
import net.javaguides.springboot.springsecurity.repository.FavoritesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.lang.reflect.Parameter;
import java.util.List;

@Service
public class FavoritesService {
    @Autowired
    FavoritesRepository favoritesRepository;

    public List<Favorites> findAll(Long id){
        return favoritesRepository.findAll(id);
    }


    public void add(Favorites favorites){
        favoritesRepository.save(favorites);
    }
}