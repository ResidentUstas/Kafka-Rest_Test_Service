package com.restKafka.demo.restControllers;
import com.restKafka.demo.Models.kafkaModel;
import com.restKafka.demo.services.kafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableKafka
@RequestMapping("msg")
@RequiredArgsConstructor
public class kafkaController {

    private final kafkaService kafkaService;

    @KafkaListener(topics="registrations", groupId = "app.1")
    public void msgListener(String msg){
        var rst = new kafkaModel(msg);
        kafkaService.save(rst);
    }
}