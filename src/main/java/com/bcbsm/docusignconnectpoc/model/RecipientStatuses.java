package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/24/17
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecipientStatuses {
    private List<RecipientStatus> recipientStatuses;

    public List<RecipientStatus> getRecipientStatuses() {
        return recipientStatuses;
    }

    @XmlElement(name = "RecipientStatus")
    public void setRecipientStatuses(List<RecipientStatus> recipientStatuses) {
        this.recipientStatuses = recipientStatuses;
    }
}
