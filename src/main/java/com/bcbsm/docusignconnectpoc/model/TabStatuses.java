package com.bcbsm.docusignconnectpoc.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 9/6/17
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class TabStatuses {
    private List<TabStatus> tabStatuses;

    public List<TabStatus> getTabStatuses() {
        return tabStatuses;
    }

    @XmlElement(name = "TabStatus")
    public void setTabStatuses(List<TabStatus> tabStatuses) {
        this.tabStatuses = tabStatuses;
    }
}
