package com.maximus.chatdto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MessageInfo implements Serializable {

    //private com.maximus.chatdto.MessageType msgType = com.maximus.chatdto.MessageType.MESSAGE_INFO_TYPE;
    private Long uniqueID;
    private Long roomId;
    private Long senderId;
    private LocalDateTime timestamp;
    private String text;
    private String content;


    public Long getId() {
        return uniqueID;
    }

    public void setId(Long id) {
        this.uniqueID = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
