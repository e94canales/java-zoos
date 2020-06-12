package com.erick.zoo.repositories;

import com.erick.zoo.models.ZooAnimals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooAnimalsRepository extends JpaRepository<ZooAnimals, Long> {
}
