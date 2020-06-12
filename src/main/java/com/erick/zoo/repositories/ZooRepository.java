package com.erick.zoo.repositories;

import com.erick.zoo.models.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepository extends JpaRepository<Zoo, Long> {
}
