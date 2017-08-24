package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/23/17
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class EnvelopeStatus {
    private Date timeGenerated;
    private String envelopeId;
    private String subject;
    private String userName;
    private String email;
    private String status;
    private Date created;
    private Date sent;
    private Date delivered;
    private String signingLocation;
    private String senderIpAddress;
    private List<RecipientStatus> recipientStatuses;

    public Date getTimeGenerated() {
        return timeGenerated;
    }

    public void setTimeGenerated(Date timeGenerated) {
        this.timeGenerated = timeGenerated;
    }

    @XmlElement(name = "EnvelopeID")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    @XmlElement(name = "Subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @XmlElement(name = "UserName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @XmlElement(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public String getSigningLocation() {
        return signingLocation;
    }

    public void setSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
    }

    public String getSenderIpAddress() {
        return senderIpAddress;
    }

    public void setSenderIpAddress(String senderIpAddress) {
        this.senderIpAddress = senderIpAddress;
    }

    public List<RecipientStatus> getRecipientStatuses() {
        return recipientStatuses;
    }

    public void setRecipientStatuses(List<RecipientStatus> recipientStatuses) {
        this.recipientStatuses = recipientStatuses;
    }
}
