package com.restKafka.demo.restControllers;
import com.restKafka.demo.Models.MessageDto;
import com.restKafka.demo.Models.restModel;
import com.restKafka.demo.services.restService;
import com.restKafka.demo.types.SendMessageStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/rest")
@RequiredArgsConstructor
public class MessageController {

    private final restService restService;

    @PostMapping
    public ResponseEntity<SendMessageStatus> sendMessage(@ModelAttribute MessageDto messageDto, @RequestHeader Map<String, String> headers) {
        var status = SendMessageStatus.Success;
        var rst = new restModel(messageDto.getBody());
        restService.save(rst);

        return ResponseEntity.ok(status);
    }
}
