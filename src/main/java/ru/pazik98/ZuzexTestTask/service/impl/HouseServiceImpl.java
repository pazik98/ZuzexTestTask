package ru.pazik98.ZuzexTestTask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pazik98.ZuzexTestTask.entity.HouseEntity;
import ru.pazik98.ZuzexTestTask.repository.HouseRepository;
import ru.pazik98.ZuzexTestTask.service.HouseService;

import java.util.List;
import java.util.Optional;

@Service
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    @Autowired
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public List<HouseEntity> getAll() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<HouseEntity> getById(Long id) {
        return houseRepository.findById(id);
    }

    @Override
    public HouseEntity save(HouseEntity HouseEntity) {
        return houseRepository.save(HouseEntity);
    }

    @Override
    public HouseEntity update(HouseEntity HouseEntity) {
        return houseRepository.save(HouseEntity);
    }

    @Override
    public void delete(Long id) {
        houseRepository.deleteById(id);
    }
}
