package com.test.adptest.exception.handler;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@SuperBuilder
public class StandardError {
    private final String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    private final HttpStatusCode status;
    private final String message;
}
