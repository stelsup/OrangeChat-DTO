package com.maximus.chatdto;

import java.io.Serializable;

public class RoomTile implements Serializable {

    private Long uniqueID;
    private String name;
    private String avatar;
    private String lastMessagePreview;
    private int unreadMessageCount;

    public RoomTile(){}

    public RoomTile(Long uniqueID, String name, String avatar, String lastMessagePreview, int unreadMessageCount) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.avatar = avatar;
        this.lastMessagePreview = lastMessagePreview;
        this.unreadMessageCount = unreadMessageCount;
    }

    public Long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Long uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLastMessagePreview() {
        return lastMessagePreview;
    }

    public void setLastMessagePreview(String lastMessagePreview) {
        this.lastMessagePreview = lastMessagePreview;
    }

    public int getUnreadMessageCount() {
        return unreadMessageCount;
    }

    public void setUnreadMessageCount(int unreadMessageCount) {
        this.unreadMessageCount = unreadMessageCount;
    }
}
