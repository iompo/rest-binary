package com.binary.upload;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA;

@Path("binary")
public class BinaryUploadEndpoint {

    @POST
    @Consumes(MULTIPART_FORM_DATA)
    @Produces(APPLICATION_JSON)
    public BinaryLocation uploadFile(@MultipartForm BinaryRequestBody binary) {
        return new BinaryLocation(binary.file.getAbsolutePath());
    }
}
