package ru.pazik98.ZuzexTestTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pazik98.ZuzexTestTask.entity.HouseEntity;

@Repository
public interface HouseRepository extends JpaRepository<HouseEntity, Long> {
}
