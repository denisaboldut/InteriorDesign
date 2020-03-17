package net.javaguides.springboot.springsecurity.web;

import net.javaguides.springboot.springsecurity.model.News;
import net.javaguides.springboot.springsecurity.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotEmpty;
import java.util.Optional;


@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    //
    @GetMapping("/all")
    public String news( Model model){
        model.addAttribute("news", newsService.getAllNews());
        return "news";
    }

    @PostMapping("/addnews")
    public String addNews(@ModelAttribute @NotEmpty News news){
        newsService.addNews(news);
        return "redirect:/news/all";
    }
    @GetMapping("/news1")
    public String news1(){
        return "news1";
    }

    @GetMapping("/news2")
    public String news2(){  return "news2";
    }

    @GetMapping("/news3")
    public String news3(){
        return "news3";
    }

    @GetMapping("/news4")
    public String news4(){
        return "news4";
    }


}