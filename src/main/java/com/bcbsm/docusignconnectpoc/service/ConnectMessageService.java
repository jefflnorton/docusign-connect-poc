package com.bcbsm.docusignconnectpoc.service;

import com.bcbsm.docusignconnectpoc.model.DocuSignEnvelopeInformation;
import com.bcbsm.docusignconnectpoc.model.mongodb.ConnectMessage;
import com.bcbsm.docusignconnectpoc.repository.ConnectMessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/24/17
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ConnectMessageService {
    private static final String STATUS_PENDING = "Pending";
    private static final String STATUS_COMPLETE = "Complete";

    private static final Logger log = LoggerFactory.getLogger(ConnectMessageService.class);

    @Autowired
    private ConnectMessageRepository repository;

    public void addConnectMessage(DocuSignEnvelopeInformation envelopeInfo) {
        ConnectMessage message = new ConnectMessage();
        message.setEnvelopeId(envelopeInfo.getEnvelopeStatus().getEnvelopeId());
        message.setTimeGenerated(envelopeInfo.getEnvelopeStatus().getTimeGenerated());
        message.setStatus(STATUS_PENDING);
        message.setMessage(envelopeInfo);

        message = repository.insert(message);
    }

    public List<DocuSignEnvelopeInformation> getPendingConnectMessages() {
        List<DocuSignEnvelopeInformation> envelopeInfoList = new ArrayList<DocuSignEnvelopeInformation>();
        List<ConnectMessage> messages = repository.findByStatus(STATUS_PENDING);

        List<String> pendingIds = new ArrayList<String>();
        for (ConnectMessage message : messages) {
            message.setStatus(STATUS_COMPLETE);
            envelopeInfoList.add(message.getMessage());
        }

        repository.save(messages);

        return envelopeInfoList;
    }
}
