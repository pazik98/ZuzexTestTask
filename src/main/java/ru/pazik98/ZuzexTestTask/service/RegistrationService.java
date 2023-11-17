package ru.pazik98.ZuzexTestTask.service;

import ru.pazik98.ZuzexTestTask.entity.RegistrationEntity;

import java.util.List;
import java.util.Optional;

public interface RegistrationService {
    List<RegistrationEntity> getAll();
    Optional<RegistrationEntity> getById(Long id);
    RegistrationEntity save(RegistrationEntity registrationEntity);
    RegistrationEntity update(RegistrationEntity registrationEntity);
    void delete(Long id);
}
