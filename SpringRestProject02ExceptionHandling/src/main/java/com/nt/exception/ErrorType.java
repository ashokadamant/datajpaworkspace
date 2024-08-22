package com.nt.exception;

import java.time.LocalDateTime;

public class ErrorType {
private LocalDateTime ldt;
private String message;
private Integer code;

public ErrorType(LocalDateTime ldt, String message, Integer code) {
	super();
	this.ldt = ldt;
	this.message = message;
	this.code = code;
}
public void m1() {
	System.out.println("ErrorType");
}

}
