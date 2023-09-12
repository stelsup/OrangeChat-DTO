package com.maximus.chatdto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OnlineStatusInfo implements Serializable {


    private EOnlineStatusInfo status;
    private LocalDateTime lastTimeOnline;


    public OnlineStatusInfo(){}

    public OnlineStatusInfo(EOnlineStatusInfo status, LocalDateTime lastTimeOnline){
        this.status = status;
        this.lastTimeOnline = lastTimeOnline;
    }

    public EOnlineStatusInfo getStatus() {
        return status;
    }

    public void setStatus(EOnlineStatusInfo status) {
        this.status = status;
    }

    public LocalDateTime getLastTimeOnline() {
        return lastTimeOnline;
    }

    public void setLastTimeOnline(LocalDateTime lastTimeOnline) {this.lastTimeOnline = lastTimeOnline; }

}
