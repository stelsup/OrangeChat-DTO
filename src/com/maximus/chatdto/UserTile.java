package com.maximus.chatdto;

import java.io.Serializable;

public class UserTile implements Serializable {

    private Long uniqueID;
    private String login;
    private String firstName;
    private String lastName;
    private String avatar;

    public UserTile(){}

    public UserTile(Long uniqueID, String login, String firstName, String lastName, String avatar) {
        this.uniqueID = uniqueID;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
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
}
