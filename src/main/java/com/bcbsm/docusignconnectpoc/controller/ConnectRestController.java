package com.bcbsm.docusignconnectpoc.controller;

import com.bcbsm.docusignconnectpoc.model.DocuSignEnvelopeInformation;
import com.bcbsm.docusignconnectpoc.service.ConnectMessageService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private ConnectMessageService connectMessageService;

    @RequestMapping(value = "/api/connect",
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public DocuSignEnvelopeInformation processConnectMessage(@RequestBody DocuSignEnvelopeInformation docuSignEnvelopeInformation) {
        log.info("envelopeInfo: " + new Gson().toJson(docuSignEnvelopeInformation));

        connectMessageService.addConnectMessage(docuSignEnvelopeInformation);

        return docuSignEnvelopeInformation;
    }

    @RequestMapping(value = "/api/connect",
            method = RequestMethod.GET)
    @ResponseBody
    public List<DocuSignEnvelopeInformation> getPendingConnectMessages() {
        log.info("Processing pending DocuSign Connect messages.");

        List<DocuSignEnvelopeInformation> envelopeInfoList = connectMessageService.getPendingConnectMessages();

        log.info("Completed processing of pending DocuSign Connect messages.");

        return envelopeInfoList;
    }

    @RequestMapping(value = "/api/test",
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void testConnectMessage(HttpServletRequest request, HttpServletResponse response) {
        log.info("Received API Test Message.");

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            log.info("Header: " + headerName + " = " + request.getHeader(headerName));
        }

        String requestBody = null;

        try {
            requestBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        log.info("requestBody: " + requestBody);

    }
}
