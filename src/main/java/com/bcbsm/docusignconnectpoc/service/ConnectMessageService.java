package com.bcbsm.docusignconnectpoc.service;

import com.bcbsm.docusignconnectpoc.model.DocuSignEnvelopeInformation;
import com.bcbsm.docusignconnectpoc.model.mongodb.ConnectMessage;
import com.bcbsm.docusignconnectpoc.repository.ConnectMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
