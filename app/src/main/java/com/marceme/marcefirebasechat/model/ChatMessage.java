package com.marceme.marcefirebasechat.model;

import com.google.firebase.database.Exclude;

/**
 * Created by Marcel on 11/7/2015.
 */
public class ChatMessage {

    private String message;
    private String imageUrl;
    private String sender;
    private String recipient;

    private int mRecipientOrSenderStatus;

    public ChatMessage() {
    }

    public ChatMessage(String message, String sender, String recipient) {
        this.message = message;
        this.recipient = recipient;
        this.sender = sender;
    }


    public void setRecipientOrSenderStatus(int recipientOrSenderStatus) {
        this.mRecipientOrSenderStatus = recipientOrSenderStatus;
    }


    public String getMessage() {
        return message;
    }

    public String getRecipient(){
        return recipient;
    }

    public String getSender(){
        return sender;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Exclude
    public int getRecipientOrSenderStatus() {
        return mRecipientOrSenderStatus;
    }
}
