package com.example.orderprojectdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class OrderExceptionHandler {

    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleException404(OrderNotFoundException ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(getMapResponseEntity(ex.getMessage(), request, status), status);
    }

    private Map<String, String> getMapResponseEntity(String message, HttpServletRequest request, HttpStatus status) {
        Map<String, String> answer = new LinkedHashMap<>();
        answer.put("message ", message);
        answer.put("error ", status.getReasonPhrase());
        answer.put("status ", String.valueOf(status.value()));
        answer.put("timestamp ", LocalDateTime.now().toString());
        answer.put("path ", request.getRequestURI());
        return answer;
    }
}
