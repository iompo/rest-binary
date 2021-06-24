package com.binary.upload;

import java.io.Serializable;
import java.net.URI;
import java.nio.file.Paths;

public class BinaryLocation implements Serializable {

    private URI location;

    @SuppressWarnings("for serialization")
    public BinaryLocation() {
    }

    public BinaryLocation(String location) {
        this.location = Paths.get(location).toUri();
    }

    public URI getLocation() {
        return location;
    }

    public void setLocation(URI location) {
        this.location = location;
    }
}
