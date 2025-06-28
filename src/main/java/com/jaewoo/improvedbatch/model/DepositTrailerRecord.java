package com.jaewoo.improvedbatch.model;

import lombok.Data;

@Data
public class DepositTrailerRecord {
    private String recordType;               // 레코드구분 (1)
    private String totalRecordCount;         // 전송레코드수 (7)
    private String requestCount;             // 의뢰건수 (7)
    private String successCount;             // 정상처리건수 (7)
    private String successAmount;            // 정상처리금액 (15)
    private String partialCount;             // 부분처리건수 (7)
    private String partialAmount;            // 부분처리금액 (15)
    private String failCount;                // 미처리건수 (7)
    private String failAmount;               // 미처리금액 (15)
    private String filler;                   // 예비 (17)
    private String lineSeparator;            // 개행문자 (2)
}
