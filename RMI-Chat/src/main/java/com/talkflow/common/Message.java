package com.talkflow.common;
import java.io.Serializable;

public class Message implements Serializable {
    private String sender;
    private String content;
    private String chatRoomId;

    // Constructors, getters, and setters


    public Message() {
    }

    public Message(String sender, String content, String chatRoomId) {
        this.sender = sender;
        this.content = content;
        this.chatRoomId = chatRoomId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChatRoomId() {
        return chatRoomId;
    }

    public void setChatRoomId(String chatRoomId) {
        this.chatRoomId = chatRoomId;
    }
}