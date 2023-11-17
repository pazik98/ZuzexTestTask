package ru.pazik98.ZuzexTestTask.service;

import ru.pazik98.ZuzexTestTask.entity.HouseEntity;
import ru.pazik98.ZuzexTestTask.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface HouseService {

    List<HouseEntity> getAll();
    Optional<HouseEntity> getById(Long id);
    HouseEntity save(HouseEntity houseEntity);
    HouseEntity update(HouseEntity houseEntity);
    void delete(Long id);
}
