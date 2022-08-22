package com.example.extendablechattingbe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChatMessage {
    private String sender;
    private String content;
    private MessageType type;

    enum  MessageType {
        CHAT, LEAVE, JOIN,
    }
}
