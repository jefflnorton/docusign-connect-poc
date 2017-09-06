package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
    private RecipientAuthenticationStatus recipientAuthenticationStatus;
    private String accountStatus;
    private String recipientId;
    private TabStatuses tabStatuses;

    @XmlElement(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @XmlElement(name = "RoutingOrder")
    public int getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(int routingOrder) {
        this.routingOrder = routingOrder;
    }

    @XmlElement(name = "Sent")
    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    @XmlElement(name = "Delivered")
    public Date getDelivered() {
        return delivered;
    }

    public void setDelivered(Date delivered) {
        this.delivered = delivered;
    }

    @XmlElement(name = "DeclineReason")
    public String getDeclineReason() {
        return declineReason;
    }

    public void setDeclineReason(String declineReason) {
        this.declineReason = declineReason;
    }

    @XmlElement(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "RecipientIPAddress")
    public String getRecipientIpAddress() {
        return recipientIpAddress;
    }

    public void setRecipientIpAddress(String recipientIpAddress) {
        this.recipientIpAddress = recipientIpAddress;
    }

    @XmlElement(name = "RecipientAuthenticationStatus")
    public RecipientAuthenticationStatus getRecipientAuthenticationStatus() {
        return recipientAuthenticationStatus;
    }

    public void setRecipientAuthenticationStatus(RecipientAuthenticationStatus recipientAuthenticationStatus) {
        this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    }

    @XmlElement(name = "AccountStatus")
    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @XmlElement(name = "RecipientId")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    @XmlElement(name = "TabStatuses")
    public TabStatuses getTabStatuses() {
        return tabStatuses;
    }

    public void setTabStatuses(TabStatuses tabStatuses) {
        this.tabStatuses = tabStatuses;
    }
}
