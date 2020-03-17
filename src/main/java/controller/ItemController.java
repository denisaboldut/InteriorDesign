package net.javaguides.springboot.springsecurity.web;


import net.javaguides.springboot.springsecurity.model.Item;
import net.javaguides.springboot.springsecurity.model.News;
import net.javaguides.springboot.springsecurity.model.Project;
import net.javaguides.springboot.springsecurity.service.ItemService;
import net.javaguides.springboot.springsecurity.service.ProjectService;
import net.javaguides.springboot.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;



    @Autowired
    UserService userService;

    @GetMapping("/all")
    public String getItems(Model model, HttpServletRequest request){
        model.addAttribute("items", itemService.retriveItems());
        model.addAttribute("client", userService.findByEmail(request.getRemoteUser()));
        return "items";
    }

    @GetMapping("/{id}")
    public String getItemsById(@PathVariable String id, Model model){
        Optional<Item> itemOptional = itemService.getItems(Long.valueOf(id));
        itemOptional.ifPresent(items -> model.addAttribute("items", items));
        return "items";
    }

    @PostMapping("/additems")
    public String addItems(@ModelAttribute @NotEmpty Item item){
        Item saved = itemService.addItem(item);
        return "redirect:/items/all";
    }
}
