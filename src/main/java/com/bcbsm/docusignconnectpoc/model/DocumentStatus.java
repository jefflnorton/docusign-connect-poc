package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 9/6/17
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class DocumentStatus {
    private int id;
    private String name;
    private String templateName;
    private int sequence;

    @XmlElement(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "TemplateName")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @XmlElement(name = "Sequence")
    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
