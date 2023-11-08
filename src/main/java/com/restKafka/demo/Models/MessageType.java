package com.restKafka.demo.Models;

import java.util.UUID;

public enum MessageType {
    AdministratorMessage(1, 14, "Сообщения от администратора системы", UUID.fromString("3133843A-10EE-424F-A4F1-80F403384CC6")),
    CubesManagerMessage(2, 14, "Сообщения от интерфейса расчета кубов", UUID.fromString("8521ECFC-CC8D-4E6E-9F1A-6A72C2747DBF")),
    BridgeClassifiersMessage(3, 14, "Сообщения от интерфейса сопоставления классификаторов", UUID.fromString("8334D1B9-06E4-4E08-B567-51F4DE8419FD")),
    TaskMessage(4, 14, "Сообщения от подсистемы задач", UUID.fromString("516967AD-E99C-4086-95FA-35E1845F8836")),

    // закачки
    PumpMessage(5, 14, "Сообщения от подсистемы закачек - этап закачки", UUID.fromString("B8C9D687-0C48-47D7-B81A-E5B60E195A95")),
    PumpProcessMessage(6, 14, "Сообщения от подсистемы закачек - этап обработки", UUID.fromString("E864329A-7301-432D-92F3-9DF9BF592847")),
    PumpAssociateMessage(7, 14, "Сообщения от подсистемы закачек - этап сопоставления", UUID.fromString("67279B98-3C98-4523-B149-9B76310A5C96")),
    PumpProcessCubesMessage(8, 14, "Сообщения от подсистемы закачек - этап расчета кубов", UUID.fromString("8785A233-59B1-4FC7-B87C-51DFE77BFF1E")),
    PumpCheckDataMessage(9, 14, "Сообщения от подсистемы закачек - этап проверки данных", UUID.fromString("3555C8BB-0736-4B1F-8E4D-DEA108235CD6")),

    // прочее
    ForecastMessage(10, 14, "Сообщения от блока прогнозирование", UUID.fromString("ED4B141A-6C70-4989-9ED2-BC494B467E1D")),
    ConsolidationMessage(11, 14, "Сообщение от форм сбора", null),
    TargetRiaMessage(12, 14, "Системные сообщения", null),
    EO15TpMessage(14, 14, "Сообщения от блока 'Целевые программы'", null),
    AssociateMessage(15, 14, "Сообщения от блока сопоставления", null),
    EO15TpExcCostsMessage(16, 14, "Сообщения от блока 'Строительство'", null),
    ;

    private final int code;
    private final int liveTime;
    private final String description;
    private final UUID messageTypeObjectKey;

    private MessageType(int code, int liveTime, String description, UUID messageTypeObjectKey) {
        this.code = code;
        this.liveTime = liveTime;
        this.description = description;
        this.messageTypeObjectKey = messageTypeObjectKey;
    }
}
