package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 9/6/17
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class DocumentStatuses {
    private List<DocumentStatus> documentStatuses;

    public List<DocumentStatus> getDocumentStatuses() {
        return documentStatuses;
    }

    @XmlElement(name = "DocumentStatus")
    public void setDocumentStatuses(List<DocumentStatus> documentStatuses) {
        this.documentStatuses = documentStatuses;
    }
}
