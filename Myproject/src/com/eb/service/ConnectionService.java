package com.eb.service;
import com.eb.entity.Commercial;
import com.eb.entity.Domestic;

import com.eb.exception.InvalidConnectionException;
import com.eb.exception.InvalidReadingException;
public class ConnectionService {
	 public boolean validate(int currentReading, int previousReading, String type)throws 
	 InvalidReadingException, InvalidConnectionException{
	 	    if(currentReading < previousReading || currentReading < 0 || previousReading < 0) {
	 		       InvalidReadingException e=new InvalidReadingException();
	 		       throw e;
	     }
	 	   else if(!type.equals("Domestic") && !type.equals("Commercial")) {
	 		       InvalidConnectionException e=new InvalidConnectionException();
	 		       throw e;
	     }
	 	 else {
	 		 return true;
	     }
	         }
}
