package com.restKafka.demo.services;

import com.restKafka.demo.Models.kafkaModel;
import com.restKafka.demo.repositories.kafkaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional(readOnly = true)
public class kafkaService {
    private final kafkaRepository kafkaRepository;

    @Autowired
    public kafkaService(kafkaRepository kafkaRepository) {
        this.kafkaRepository = kafkaRepository;
    }

    @Transactional
    public void save(kafkaModel kafka) {
        kafka.setDate(new Date());
        kafkaRepository.save(kafka);
    }
}
