package com.setu.biller.error;


import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String code;
    private String message;
    private String details;
    private String traceID;
	private String docURL;

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public ErrorDetails(Date timestamp, String message, String code, String details, String traceID, String docURL) {
         super();
         this.timestamp = timestamp;
         this.message = message;
         this.code = code;
         this.details = details;
         this.traceID = traceID;
         this.docURL = docURL;
    }
	
	public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
   }
    public Date getTimestamp() {
         return timestamp;
    }

    public String getMessage() {
         return message;
    }

    public String getDetails() {
         return details;
    }
}