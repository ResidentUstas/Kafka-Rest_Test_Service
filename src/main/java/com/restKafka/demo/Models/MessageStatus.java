package com.restKafka.demo.Models;

public enum MessageStatus {

    New(1, "Новое сообщение"),
    Read(2, "Сообщение прочитано"),
    Deleted(3, "Сообщение удалено");

    private final int code;
    private final String description;

    private MessageStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
