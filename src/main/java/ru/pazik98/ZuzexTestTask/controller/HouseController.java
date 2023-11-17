package ru.pazik98.ZuzexTestTask.controller;

import org.springframework.web.bind.annotation.*;
import ru.pazik98.ZuzexTestTask.entity.HouseEntity;
import ru.pazik98.ZuzexTestTask.entity.RegistrationEntity;
import ru.pazik98.ZuzexTestTask.service.HouseService;
import ru.pazik98.ZuzexTestTask.service.RegistrationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/houses")
public class HouseController {

    private final HouseService houseService;
    private final RegistrationService registrationService;

    public HouseController(HouseService houseService, RegistrationService registrationService) {
        this.houseService = houseService;
        this.registrationService = registrationService;
    }

    @GetMapping
    public List<HouseEntity> getAll() {
        return houseService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<HouseEntity> getById(@PathVariable("id") Long id) {
        return houseService.getById(id);
    }

    @PostMapping
    public HouseEntity save(@RequestBody HouseEntity houseEntity) {
        return houseService.save(houseEntity);
    }

    @PutMapping
    public HouseEntity update(@RequestBody HouseEntity house) {
        return houseService.update(house);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        houseService.delete(id);
    }

    @PostMapping("/{id}/users/{user-id}")
    public RegistrationEntity addUser(@PathVariable("id") Long id, @PathVariable("user-id") Long userId) {
        return registrationService.save(new RegistrationEntity(id, userId));
    }
}
