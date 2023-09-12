package com.maximus.chatdto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;


public class RoomInfo implements Serializable {

    private Long uniqueID;
    private String name;
    private String avatar;
    private LocalDateTime dateOfModify;
    private Long ownerId;
    private Set<UserInfo> members;

    public RoomInfo(){}

    public RoomInfo(Long uniqueID, String name, String avatar, LocalDateTime dateOfModify, Long ownerId, Set<UserInfo> members) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.avatar = avatar;
        this.dateOfModify = dateOfModify;
        this.ownerId = ownerId;
        this.members = members;
    }

    public Long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Long id) { this.uniqueID = id; }

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

    public LocalDateTime getDateOfModify() {
        return dateOfModify;
    }

    public void setDateOfModify(LocalDateTime dateOfModify) {
        this.dateOfModify = dateOfModify;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Set<UserInfo> getMembers() {
        return members;
    }

    public void setMembers(Set<UserInfo> members) {
        this.members = members;
    }
}
