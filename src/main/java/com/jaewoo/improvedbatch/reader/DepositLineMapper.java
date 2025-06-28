package com.jaewoo.improvedbatch.reader;

import com.jaewoo.improvedbatch.model.DepositDataRecord;
import org.springframework.batch.item.file.LineMapper;

public class DepositLineMapper implements LineMapper<DepositDataRecord> {

    @Override
    public DepositDataRecord mapLine(String line, int lineNumber) {
        // 라인 길이 검증 (필수)
        if (line.length() != 100) {
            throw new IllegalArgumentException("잘못된 레코드 길이: " + line.length());
        }

        // 레코드 구분 추출
        String recordType = line.substring(0, 1);

        // D라인(데이터부)만 처리
        if (!"D".equals(recordType)) {
            return null; // skip할 수 있도록 null 반환
        }

        DepositDataRecord record = new DepositDataRecord();
        record.setRecordType(recordType);
        record.setSequenceNumber(line.substring(1, 8));
        record.setBankCode(line.substring(8, 11));
        record.setAccountNumber(line.substring(11, 27));
        record.setRequestedAmount(line.substring(27, 40));
        record.setTransferResult(line.substring(40, 41));
        record.setResultCode(line.substring(41, 45));
        record.setUnprocessedAmount(line.substring(45, 58));
        record.setDepositorNumber(line.substring(58, 78));
        record.setPassbookItemCode(line.substring(78, 82));
        record.setPassbookDetail(line.substring(82, 96));
        record.setFiller(line.substring(96, 98));
        record.setLineSeparator(line.substring(98, 100));

        return record;
    }
}
