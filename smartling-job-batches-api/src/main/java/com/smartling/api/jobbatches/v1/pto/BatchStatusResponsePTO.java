package com.smartling.api.jobbatches.v1.pto;

import com.smartling.api.v2.response.ResponseData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchStatusResponsePTO implements ResponseData
{
    private String status;
    private Boolean authorized;
    private String generalErrors;
    private String translationJobUid;
    private String projectId;
    private Calendar updatedDate;
    private List<BatchItemPTO> files;
}
