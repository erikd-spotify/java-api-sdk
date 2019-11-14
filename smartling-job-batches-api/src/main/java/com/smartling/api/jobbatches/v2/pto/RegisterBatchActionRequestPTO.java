package com.smartling.api.jobbatches.v2.pto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterBatchActionRequestPTO
{
    private String action = "REGISTER_FILE";
    private String fileUri;
}
