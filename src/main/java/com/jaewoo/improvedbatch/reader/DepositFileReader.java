package com.jaewoo.improvedbatch.reader;

import com.jaewoo.improvedbatch.model.DepositDataRecord;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.FileSystemResource;

public class DepositFileReader {

    public static FlatFileItemReader<DepositDataRecord> reader(String filePath) {
        FlatFileItemReader<DepositDataRecord> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource(filePath));
        reader.setLineMapper(new DepositLineMapper());

        // null 반환된 줄은 skip
        reader.setStrict(false); // 파일 없을 경우 에러 방지
        return reader;
    }
}
