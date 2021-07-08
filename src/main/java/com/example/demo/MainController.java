package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private World_StateRepo worldRepo;

    @GetMapping("/Main")
    public String homepage(){
        return "Main";
    }

    @GetMapping("")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }
    @GetMapping("/worlds")
    public String listWorlds(Model model) {
        List<World_state> listWorlds = worldRepo.findAll();
        model.addAttribute("listWorlds", listWorlds);
        return "worlds";
    }
    @GetMapping("/create")
    public String Create(Model model){
        model.addAttribute("worlds", new World_state());
        return "create";
    }
    @PostMapping("/process_create")
    public String processCreate(World_state world_state){
        worldRepo.save(world_state);
        return "process_create";
    }



}
