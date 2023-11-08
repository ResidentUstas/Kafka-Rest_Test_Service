package com.restKafka.demo.Models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class MessageDto {
    @NotNull
    private String subject;

    private String body;
//    public MessageDto(String bodys) {
//        body = bodys;
//        dateTimeOfCreation = LocalDateTime.now();
//        dateTimeOfActual = null; ///LocalDateTime.MIN;
//        messageStatus = MessageStatus.New;
//        messageImportance = MessageImportance.Regular;
//        messageType = MessageType.AdministratorMessage;
//    }
}
