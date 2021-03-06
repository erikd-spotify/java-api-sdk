package com.smartling.api.jobs.v3.pto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smartling.api.v2.response.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsyncResponsePTO implements ResponseData
{
    private String message;
    private String url;
    private String processUid;
    @JsonIgnore
    public boolean isAsync()
    {
        return processUid != null && !processUid.isEmpty();
    }
}
