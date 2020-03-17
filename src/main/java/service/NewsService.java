package net.javaguides.springboot.springsecurity.service;

import net.javaguides.springboot.springsecurity.model.News;
import net.javaguides.springboot.springsecurity.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public News addNews(News news){
        if (news != null){
            return newsRepository.save(news);
        } else {
            throw new IllegalArgumentException("cannot save news");
        }
    }

    public Optional<News> getNews(Long id){
        return newsRepository.findById(id);
    }
    public List<News> getAllNews(){
        return newsRepository.findAll();
    }
}
