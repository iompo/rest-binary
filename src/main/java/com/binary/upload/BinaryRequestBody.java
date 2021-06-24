package com.binary.upload;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.FormParam;
import java.io.File;

import static javax.ws.rs.core.MediaType.APPLICATION_OCTET_STREAM;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

public class BinaryRequestBody {

    @FormParam("file")
    @PartType(APPLICATION_OCTET_STREAM)
    public File file;

    @FormParam("fileName")
    @PartType(TEXT_PLAIN)
    public String fileName;

}
