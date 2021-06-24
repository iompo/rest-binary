# rest-binary project
A test project to verify the issue [18113](https://github.com/quarkusio/quarkus/issues/18113) of quarkus.

The project contains a single REST endpoint reachable as a `POST` at `/rest/binary`. 

The content of the request should be a multipart made of two properties:
* "fileName": a string containing the file name
* "file": the binary

The current setting defines `/tmp/tempFolder` as the upload folder through the property `quarkus.http.body-handler.uploads-directory`.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```
