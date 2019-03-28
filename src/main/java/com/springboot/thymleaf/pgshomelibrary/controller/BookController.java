package com.springboot.thymleaf.pgshomelibrary.controller;


import com.springboot.thymleaf.pgshomelibrary.model.Book;
import com.springboot.thymleaf.pgshomelibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.validation.constraints.Null;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String books(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        model.addAttribute("book", new Book());
        model.addAttribute("pageTitle", "Books");
        model.addAttribute("isAdd", true);
        return "view/books";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute Book book, RedirectAttributes redirectAttributes, Model model) {
        Book dbBook = bookService.save(book);
        if (dbBook != null) {
            redirectAttributes.addFlashAttribute("successmsg", "Book was saved successfully");
            return "redirect:/";
        } else {
            model.addAttribute("errormsg", "Book is not save, try again");
            model.addAttribute("book", book);
            return "view/books";
        }
    }
}
