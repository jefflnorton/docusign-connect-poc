package com.bcbsm.docusignconnectpoc.controller;

import com.bcbsm.docusignconnectpoc.model.DocuSignEnvelopeInformation;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/23/17
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class ConnectRestController {
    private static final Logger log = LoggerFactory.getLogger(ConnectRestController.class);

    @RequestMapping(value = "/api/connect",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public DocuSignEnvelopeInformation processConnectMessage(@RequestBody DocuSignEnvelopeInformation docuSignEnvelopeInformation) {
        log.info("envelopeInfo: " + new Gson().toJson(docuSignEnvelopeInformation));

        return docuSignEnvelopeInformation;
    }
}
