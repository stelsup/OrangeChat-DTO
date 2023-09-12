package com.maximus.chatdto;

public enum MessageType {
    USER_INFO_TYPE,
    ROOM_INFO_TYPE,
    MESSAGE_INFO_TYPE,
    UNKNOWN_TYPE;

    public static MessageType fromString(String str) {
        switch(str)
        {
            case "USER_INFO_TYPE":
                return USER_INFO_TYPE;

            case "ROOM_INFO_TYPE":
                return ROOM_INFO_TYPE;

            case "MESSAGE_TYPE":
                return MESSAGE_INFO_TYPE;

            default:
                return UNKNOWN_TYPE;
        }
    }
}
