package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 9/6/17
 * Time: 11:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class TabStatus {
    private String tabType;
    private String status;
    private int xPosition;
    private int yPosition;
    private String tabLabel;
    private String tabName;
    private String tabValue;
    private String documentId;
    private String pageNumber;
    private String originalValue;
    private String validationPattern;
    private String customTabType;

    @XmlElement(name = "TabType")
    public String getTabType() {
        return tabType;
    }

    public void setTabType(String tabType) {
        this.tabType = tabType;
    }

    @XmlElement(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlElement(name = "XPosition")
    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    @XmlElement(name = "XPosition")
    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    @XmlElement(name = "TabLabel")
    public String getTabLabel() {
        return tabLabel;
    }

    public void setTabLabel(String tabLabel) {
        this.tabLabel = tabLabel;
    }

    @XmlElement(name = "TabName")
    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    @XmlElement(name = "TabValue")
    public String getTabValue() {
        return tabValue;
    }

    public void setTabValue(String tabValue) {
        this.tabValue = tabValue;
    }

    @XmlElement(name = "DocumentID")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @XmlElement(name = "PageNumber")
    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    @XmlElement(name = "OriginalValue")
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    @XmlElement(name = "ValidationPattern")
    public String getValidationPattern() {
        return validationPattern;
    }

    public void setValidationPattern(String validationPattern) {
        this.validationPattern = validationPattern;
    }

    @XmlElement(name = "CustomTabType")
    public String getCustomTabType() {
        return customTabType;
    }

    public void setCustomTabType(String customTabType) {
        this.customTabType = customTabType;
    }
}
