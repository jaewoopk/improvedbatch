package com.jaewoo.improvedbatch.model;

import lombok.Data;

@Data
public class DepositHeaderRecord {
    private String recordType;               // 레코드구분 (1)
    private String ioType;                   // 송수신구분 (2)
    private String institutionCode;          // 기관코드 (10)
    private String bankCode;                 // 은행코드 (3)
    private String transferStartDate;        // 이체시작일자 (8)
    private String transferProcessDate;      // 이체처리일자 (8)
    private String parentAccountNumber;      // 모계좌번호 (16)
    private String retrySign;                // 복기부호 (10)
    private String mainInstitutionCode;      // 대표기관코드 (10)
    private String resultNotifyType;         // 처리결과통보구분 (1)
    private String filler;                   // 예비 (29)
    private String lineSeparator;            // 개행문자 (2)
}
