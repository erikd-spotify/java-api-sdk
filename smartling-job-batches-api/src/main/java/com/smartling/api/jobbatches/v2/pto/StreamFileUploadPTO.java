package com.smartling.api.jobbatches.v2.pto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.annotations.providers.multipart.PartFilename;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.FormParam;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreamFileUploadPTO
{
    @FormParam("fileType")
    @PartType("text/plain")
    private String fileType;
    @FormParam("fileUri")
    @PartType("text/plain")
    private String fileUri;
    @FormParam("authorize")
    @PartType("text/plain")
    private Boolean authorize;
    @FormParam("callbackUrl")
    @PartType("text/plain")
    private String callbackUrl;
    @FormParam("localeIdsToAuthorize[]")
    @PartType("text/plain")
    private List<String> localeIdsToAuthorize;
    @FormParam("charset")
    @PartType("text/plain")
    private String charset;
    @FormParam("file")
    @PartType("application/octet-stream")
    @PartFilename("file")
    private InputStream file;
    private Map<String, String> directives;
}
