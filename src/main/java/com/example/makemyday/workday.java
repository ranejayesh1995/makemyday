package com.example.makemyday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class workday {
    @GetMapping({"/workday"})
    public String getData() {
        return "Please work your task on scheduled manner & not delayed";
    }
}
