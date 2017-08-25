package com.bcbsm.docusignconnectpoc.model.mongodb;

import com.bcbsm.docusignconnectpoc.model.DocuSignEnvelopeInformation;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/24/17
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectMessage {
    @Id
    private String id;
    private String status;
    private String envelopeId;
    private Date timeGenerated;
    private DocuSignEnvelopeInformation message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public Date getTimeGenerated() {
        return timeGenerated;
    }

    public void setTimeGenerated(Date timeGenerated) {
        this.timeGenerated = timeGenerated;
    }

    public DocuSignEnvelopeInformation getMessage() {
        return message;
    }

    public void setMessage(DocuSignEnvelopeInformation message) {
        this.message = message;
    }
}
