package com.example.plus.assistant.Dialog;

/**
 * Created by Elif SALMAN on 20.11.2016.
 */

public class DialogMessage {
    private boolean isUser, isAssistant;
    private String content;

    public DialogMessage(String message, boolean user, boolean assistant) {
        content = message;
        isUser = user;
        isAssistant = assistant;
    }

    public void setUser(boolean user) {
        isUser = user;
    }

    public void setAssistant(boolean assistant) {
        isAssistant = assistant;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isUser() {
        return isUser;
    }

    public boolean isAssistant() {
        return isAssistant;
    }
}
