package dev.adnan.controllers;

import dev.adnan.models.User;
import dev.adnan.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody User getUser(@PathVariable(name = "id") Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    // TODO: Add a post mapping for creating user.
    // Implement DTO'S if you like.

}
