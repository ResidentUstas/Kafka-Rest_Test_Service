package com.restKafka.demo.services;

import com.restKafka.demo.Models.restModel;
import com.restKafka.demo.repositories.restRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

@Service
@Transactional(readOnly = true)
public class restService {
    private final restRepository restRepository;

    @Autowired
    public restService(restRepository restRepository) {
        this.restRepository = restRepository;
    }

    @Transactional
    public void save(restModel rest) {
        rest.setDate(new Date());
        rest.setTime(new Timestamp(new Date().getTime()));
        restRepository.save(rest);
    }
}
