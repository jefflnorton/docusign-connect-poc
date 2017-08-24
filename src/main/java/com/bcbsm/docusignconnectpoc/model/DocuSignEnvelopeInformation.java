package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/23/17
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement(name = "DocuSignEnvelopeInformation",
        namespace = "http://www.docusign.net/API/3.0")
public class DocuSignEnvelopeInformation implements Serializable {
    private EnvelopeStatus envelopeStatus;

    @XmlElement(name = "EnvelopeStatus")
    public EnvelopeStatus getEnvelopeStatus() {
        return envelopeStatus;
    }

    public void setEnvelopeStatus(EnvelopeStatus envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }
}
