package com.kaicom.exception;

public class SelfException extends Exception{
	private Integer code ;
	
	private String msg ;
	
	public SelfException(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public SelfException(){
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
