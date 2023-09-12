package com.maximus.chatdto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProfileInfo implements Serializable {

    private Long uniqueID;
    private String login;
    private String firstName;
    private String lastName;
    private String avatar;
    private LocalDate dateOfBirth;
    private String email;
    private OnlineStatusInfo onlineStatus;

    public ProfileInfo(){}

    public ProfileInfo(Long uniqueID, String login, String firstName, String lastName, String avatar, LocalDate dateOfBirth, String email, OnlineStatusInfo onlineStatus) {
        this.uniqueID = uniqueID;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.onlineStatus = onlineStatus;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OnlineStatusInfo getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(OnlineStatusInfo onlineStatus) {
        this.onlineStatus = onlineStatus;
    }
}
