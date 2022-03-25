package com.dumildematos.chatserver.controller.model;

import lombok.Data;

@Data
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
