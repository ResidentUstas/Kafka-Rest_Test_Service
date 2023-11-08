package com.restKafka.demo.repositories;

import com.restKafka.demo.Models.kafkaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kafkaRepository extends JpaRepository<kafkaModel, Integer> {
}
