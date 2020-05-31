package com.setu.biller.entity;

public class CustomerError {

	private String code;
	private String title;
	private String detail;
	private String traceID;
	private String docURL;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTraceID() {
		return traceID;
	}
	public void setTraceID(String traceID) {
		this.traceID = traceID;
	}
	public String getDocURL() {
		return docURL;
	}
	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}
	
	
}