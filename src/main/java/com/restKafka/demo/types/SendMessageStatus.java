package com.restKafka.demo.types;

public enum SendMessageStatus {

    /// <summary>
    /// Успешно
    /// </summary>
    Success(187),

    /// <summary>
    /// С ошибками
    /// </summary>
    Failure(32),      // 00100000

    /// <summary>
    /// Успешно с предупреждениями
    /// </summary>
    Warning(171);      // 10101011

    private final int code;

    private SendMessageStatus(int code) {
        this.code = code;
    }
}
