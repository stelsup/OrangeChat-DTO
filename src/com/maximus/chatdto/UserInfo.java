package com.maximus.chatdto;

import java.io.Serializable;


public class UserInfo implements Serializable {

    private Long uniqueID;
    private String login;
    private String firstName;
    private String lastName;
    private String avatar;
    private OnlineStatusInfo onlineStatus;

    public UserInfo(){

    }


    public Long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Long uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public OnlineStatusInfo getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(OnlineStatusInfo onlineStatusInfo) {
        this.onlineStatus = onlineStatusInfo;
    }




}
