package com.maximus.chatdto;

import java.io.Serializable;

public class SearchTile implements Serializable {

    private Long uniqueID;
    private SearchType type;
    private String avatar;
    private String name;
    private String login;
    private String firstName;
    private String lastName;

    public SearchTile(){}


    public void setSearchTileFromRoomTile(Long uniqueID, String avatar, String name){

        this.uniqueID = uniqueID;
        this.type = SearchType.ROOM_TILE_TYPE;
        this.avatar = avatar;
        this.name = name;

    }


    public void setSearchTileFromUserTile(Long uniqueID, String avatar, String login, String firstName, String lastName){

        this.uniqueID = uniqueID;
        this.type = SearchType.USER_TILE_TYPE;
        this.avatar = avatar;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;

   }


    public Long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(Long uniqueID) {
        this.uniqueID = uniqueID;
    }

    public SearchType getType() {
        return type;
    }

    public void setType(SearchType type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
