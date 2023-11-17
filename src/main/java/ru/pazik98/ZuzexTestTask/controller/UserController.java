package ru.pazik98.ZuzexTestTask.controller;

import org.springframework.web.bind.annotation.*;
import ru.pazik98.ZuzexTestTask.entity.UserEntity;
import ru.pazik98.ZuzexTestTask.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @PostMapping
    public UserEntity save(@RequestBody UserEntity userEntity) {
        return userService.save(userEntity);
    }

    @PutMapping
    public UserEntity update(@RequestBody UserEntity userEntity) {
        return userService.update(userEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}
