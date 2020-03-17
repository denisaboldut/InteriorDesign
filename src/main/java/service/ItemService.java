package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.DesignerMessage;
import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.model.News;
import net.javaguides.springboot.springsecurity.model.Project;
import net.javaguides.springboot.springsecurity.repository.ItemRepository;
import net.javaguides.springboot.springsecurity.repository.NewsRepository;
import net.javaguides.springboot.springsecurity.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item addItem(Item item){
        if (item != null){
            return itemRepository.save(item);
        } else {
            throw new IllegalArgumentException("cannot save items");
        }
    }

    public Optional<Item> getItems(Long id){
        return itemRepository.findById(id);
    }

    public List<Item> retriveItems(){
        return  itemRepository.findAll();
    }
    public Optional<Item> findById(Long id){
        return itemRepository.findById(id);
    }
}
