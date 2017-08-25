package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/24/17
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class RecipientAuthenticationStatus {
    private AccessCodeResult accessCodeResult;

    @XmlElement(name = "AccessCodeResult")
    public AccessCodeResult getAccessCodeResult() {
        return accessCodeResult;
    }

    public void setAccessCodeResult(AccessCodeResult accessCodeResult) {
        this.accessCodeResult = accessCodeResult;
    }
}
