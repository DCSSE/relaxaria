package com.task.pract_task.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = {ChangeSetPersister.NotFoundException.class})
    public String handleNotFoundException(HttpServletRequest request) {
        return "error-404";
    }

}
