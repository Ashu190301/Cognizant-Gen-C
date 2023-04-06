package com.cts.ems.employeemanagementsystem.exception;
import org.springframework.dao.DuplicateKeyException;

public class DuplicateEntryException extends DuplicateKeyException{
	 public DuplicateEntryException(String msg) {
		super(msg);
	}

	
}
