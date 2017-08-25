package com.bcbsm.docusignconnectpoc.repository;

import com.bcbsm.docusignconnectpoc.model.mongodb.ConnectMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/24/17
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ConnectMessageRepository extends MongoRepository<ConnectMessage, String> {
    public List<ConnectMessage> findByEnvelopeId(String envelopeId);
    public List<ConnectMessage> findByStatus(String status);
}
