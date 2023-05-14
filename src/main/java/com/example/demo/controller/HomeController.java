package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private List<Book> listBook;

    @GetMapping
    public String Home(Model model) {
        model.addAttribute("books", listBook);
        return "home/index";
    }
    @GetMapping("/contact")
    public String Contact() {
        return "home/contact";
    }
    @PostMapping("/contact")
    public String Feedback(@RequestParam("name") String name,
                              @RequestParam("email") String email,
                              @RequestParam("message") String message,
                              Model model){
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("message", message);
        return "home/feedback";
    }
    @ResponseBody
    @GetMapping("Book/{ID}")
    public String getBook(@PathVariable int ID){
        return "Book: " + ID;
    }
}
