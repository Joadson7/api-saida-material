package br.com.empresa.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;


public class ApiError {

	private LocalDateTime timestamp;
    private int status;
    private String erro;
    private String path;

    public ApiError(int status, String erro, String path) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.erro = erro;
        this.path = path;
    }

    public LocalDateTime getTimestamp() { return timestamp; }
    public int getStatus() { return status; }
    public String getErro() { return erro; }
    public String getPath() { return path; }
}

