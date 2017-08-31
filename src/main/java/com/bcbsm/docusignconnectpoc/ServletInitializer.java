package com.bcbsm.docusignconnectpoc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: e111128
 * Date: 8/31/17
 * Time: 11:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class ServletInitializer extends SpringBootServletInitializer {
    private static Class<ServletInitializer> servletInit = ServletInitializer.class;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(servletInit);
    }
}
