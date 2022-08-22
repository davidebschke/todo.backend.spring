package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler(value =TodoNotFoundException.class)
    public ResponseEntity handleTodoNotFoundException(TodoNotFoundException exception) {

        Map<String, Object> responseBody = new LinkedHashMap<>();
        responseBody.put("Timestamp", LocalDateTime.now());
        responseBody.put("message", "toDo not found");

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

}
