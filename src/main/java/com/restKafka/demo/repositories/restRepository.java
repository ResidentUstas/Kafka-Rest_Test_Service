package com.restKafka.demo.repositories;

import com.restKafka.demo.Models.restModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restRepository  extends JpaRepository<restModel, Integer> {
}
