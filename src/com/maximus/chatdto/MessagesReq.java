package com.maximus.chatdto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MessagesReq implements Serializable {

    private Long roomId;
    private LocalDateTime position;

    public MessagesReq() {}

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public LocalDateTime getPosition() {
        return position;
    }

    public void setPosition(LocalDateTime position) {
        this.position = position;
    }
}
