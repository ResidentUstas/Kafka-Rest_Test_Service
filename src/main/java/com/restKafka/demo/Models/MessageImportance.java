package com.restKafka.demo.Models;

public enum MessageImportance {

    HighImportance(1, "Высокая важность"),
    Importance(2, "Важное"),
    Regular(3, "Обычное"),
    Unimportant(4, "Неважное");

    private final int code;
    private final String description;

    private MessageImportance(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
