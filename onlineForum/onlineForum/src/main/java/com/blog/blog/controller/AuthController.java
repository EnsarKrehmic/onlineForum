package com.blog.blog.controller;

import com.blog.blog.dto.RegistrationDto;
import com.blog.blog.entity.User;
import com.blog.blog.service.UserService;
import jakarta.validation.Valid;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;

@Controller
public class AuthController {
    private UserService userService;
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model)
    {
        RegistrationDto user = new RegistrationDto();
        model.addAttribute("user",user);
        return "register";
    }

    @PostMapping("/register/save")
    public String register(@Valid @ModelAttribute("user") RegistrationDto user,
                           BindingResult result,Model model)
    {
        User existingUser = userService.findByEmail(user.getEmail());
        if (existingUser!=null)
        {
            result.rejectValue("email",null,"Korisnik već postoji!");
        }
        if(result.hasErrors())
        {
            model.addAttribute("user",user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }

    @GetMapping("/login")
    public String loginPage()
    {
        Locale currentLocale = LocaleContextHolder.getLocale();
        System.out.println("Trenutni jezik: " + currentLocale);
        return "login";
    }
}
