package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
    private Date signed;
    private Date completed;
    private String signingLocation;
    private String senderIpAddress;
    private RecipientStatuses recipientStatuses;

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

    @XmlElement(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "Created")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    @XmlElement(name = "Signed")
    public Date getSigned() {
        return signed;
    }

    public void setSigned(Date signed) {
        this.signed = signed;
    }

    @XmlElement(name = "Completed")
    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    @XmlElement(name = "SigningLocation")
    public String getSigningLocation() {
        return signingLocation;
    }

    public void setSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
    }

    @XmlElement(name = "SenderIPAddress")
    public String getSenderIpAddress() {
        return senderIpAddress;
    }

    public void setSenderIpAddress(String senderIpAddress) {
        this.senderIpAddress = senderIpAddress;
    }

    @XmlElement(name = "RecipientStatuses")
    public RecipientStatuses getRecipientStatuses() {
        return recipientStatuses;
    }

    public void setRecipientStatuses(RecipientStatuses recipientStatuses) {
        this.recipientStatuses = recipientStatuses;
    }
}
