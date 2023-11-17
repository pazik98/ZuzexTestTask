package ru.pazik98.ZuzexTestTask.controller;

import org.springframework.web.bind.annotation.*;
import ru.pazik98.ZuzexTestTask.entity.HouseEntity;
import ru.pazik98.ZuzexTestTask.service.HouseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/houses")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
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
}
