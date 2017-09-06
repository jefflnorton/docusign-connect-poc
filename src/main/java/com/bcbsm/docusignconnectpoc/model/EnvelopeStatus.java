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
    private String acStatus;
    private Date acStatusDate;
    private String acHolder;
    private String acHolderEmail;
    private String acHolderLocation;
    private boolean autoNavigation;
    private boolean envelopeIdStamping;
    private boolean authoritativeCopy;
    private DocumentStatuses documentStatuses;
    private String timeZone;
    private int timeZoneOffset;

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

    @XmlElement(name = "ACStatus")
    public String getAcStatus() {
        return acStatus;
    }

    public void setAcStatus(String acStatus) {
        this.acStatus = acStatus;
    }

    @XmlElement(name = "ACStatusDate")
    public Date getAcStatusDate() {
        return acStatusDate;
    }

    public void setAcStatusDate(Date acStatusDate) {
        this.acStatusDate = acStatusDate;
    }

    @XmlElement(name = "ACHolder")
    public String getAcHolder() {
        return acHolder;
    }

    public void setAcHolder(String acHolder) {
        this.acHolder = acHolder;
    }

    @XmlElement(name = "ACHolderEmail")
    public String getAcHolderEmail() {
        return acHolderEmail;
    }

    public void setAcHolderEmail(String acHolderEmail) {
        this.acHolderEmail = acHolderEmail;
    }

    @XmlElement(name = "ACHolderLocation")
    public String getAcHolderLocation() {
        return acHolderLocation;
    }

    public void setAcHolderLocation(String acHolderLocation) {
        this.acHolderLocation = acHolderLocation;
    }

    @XmlElement(name = "AutoNavigation")
    public boolean isAutoNavigation() {
        return autoNavigation;
    }

    public void setAutoNavigation(boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }

    @XmlElement(name = "EnvelopeIdStamping")
    public boolean isEnvelopeIdStamping() {
        return envelopeIdStamping;
    }

    public void setEnvelopeIdStamping(boolean envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }

    @XmlElement(name = "AuthoritativeCopy")
    public boolean isAuthoritativeCopy() {
        return authoritativeCopy;
    }

    public void setAuthoritativeCopy(boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }

    @XmlElement(name = "DocumentStatuses")
    public DocumentStatuses getDocumentStatuses() {
        return documentStatuses;
    }

    public void setDocumentStatuses(DocumentStatuses documentStatuses) {
        this.documentStatuses = documentStatuses;
    }

    @XmlElement(name = "TimeZone")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @XmlElement(name = "TimeZoneOffset")
    public int getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(int timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }
}
