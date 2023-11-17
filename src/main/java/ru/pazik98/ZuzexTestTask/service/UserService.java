package ru.pazik98.ZuzexTestTask.service;

import ru.pazik98.ZuzexTestTask.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserEntity> getAll();
    Optional<UserEntity> getById(Long id);
    UserEntity save(UserEntity userEntity);
    UserEntity update(UserEntity userEntity);
    void delete(Long id);
}
