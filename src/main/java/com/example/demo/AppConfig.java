package com.example.demo;
import com.example.demo.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Lap Trinh 1","images/book1.png"));
        books.add(new Book(2,"Lap Trinh 2","images/book2.png"));
        books.add(new Book(3,"Lap Trinh 3","images/book3.png"));
        return books;
    }
}
