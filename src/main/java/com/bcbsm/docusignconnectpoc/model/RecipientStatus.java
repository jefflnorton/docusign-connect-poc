package com.bcbsm.docusignconnectpoc.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/23/17
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecipientStatus {
    private String type;
    private String email;
    private String userName;
    private int routingOrder;
    private Date sent;
    private Date delivered;
    private String declineReason;
    private String status;
    private String recipientIpAddress;
    private String accountStatus;
    private String recipientId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(int routingOrder) {
        this.routingOrder = routingOrder;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public Date getDelivered() {
        return delivered;
    }

    public void setDelivered(Date delivered) {
        this.delivered = delivered;
    }

    public String getDeclineReason() {
        return declineReason;
    }

    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecipientIpAddress() {
        return recipientIpAddress;
    }

    public void setRecipientIpAddress(String recipientIpAddress) {
        this.recipientIpAddress = recipientIpAddress;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }
}
