package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/24/17
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class AccessCodeResult {
    private String status;
    private Date eventTimestamp;

    @XmlElement(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "EventTimestamp")
    public Date getEventTimestamp() {
        return eventTimestamp;
    }

    public void setEventTimestamp(Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }
}
