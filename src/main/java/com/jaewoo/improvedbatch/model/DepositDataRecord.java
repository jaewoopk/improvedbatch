package com.jaewoo.improvedbatch.model;

import lombok.Data;

@Data
public class DepositDataRecord {
    private String recordType;               // 레코드구분 (1)
    private String sequenceNumber;           // 일련번호 (7)
    private String bankCode;                 // 은행코드 (3)
    private String accountNumber;            // 계좌번호 (16)
    private String requestedAmount;          // 이체의뢰금액 (13)
    private String transferResult;           // 이체결과 (1)
    private String resultCode;               // 결과코드 (4)
    private String unprocessedAmount;        // 미처리금액 (13)
    private String depositorNumber;          // 납부자번호 (20)
    private String passbookItemCode;         // 통장기장항목코드 (4)
    private String passbookDetail;           // 통장기장내역 (14)
    private String filler;                   // 예비 (2)
    private String lineSeparator;            // 개행문자 (2)
}
