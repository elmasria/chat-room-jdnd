package edu.udacity.java.nano.chat;

/**
 * WebSocket message model
 */
public class Message {
    private String msg;
    private String username;
    private String onlineCount;
    private MessageType type;

    public Message() {
    }

    public Message(String msg, String username) {
        this.msg = msg;
        this.msg = msg;
        this.type = MessageType.OTHER;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(String onlineCount) {
        this.onlineCount = onlineCount;
    }

}
