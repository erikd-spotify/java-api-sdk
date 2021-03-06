package com.smartling.api.jobbatches.v1.pto;

import com.smartling.api.v2.response.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchPTO implements ResponseData
{
    private String batchUid;
    private String status;
    private Boolean authorized;
    private String translationJobUid;
    private String projectId;
    private Calendar createdDate;
    private Calendar modifiedDate;
    private Boolean hasError;
}
