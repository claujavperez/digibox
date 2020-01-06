package com.digibox.Evaluation.cjp.exception;

import java.util.Date;

/**
 * 
 *@author Claudio Perez
 *@version 1.0 
 **
 */

public class MessageDetails {
	    private Date timestamp;
	    private String message;
	    private String details;

	    public MessageDetails(java.util.Date date, String message, String details) {
	        super();
	        this.timestamp = (Date) date;
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
