package com.airhacks.full.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/ping")
public class PingResource {

    private static final Logger logger = LoggerFactory.getLogger(PingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        logger.info("Testing this logger");
        return "hello";
    }
}