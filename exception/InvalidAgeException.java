package com.tns.exception;

public class InvalidAgeException extends Exception{
// declaring  a parametrtized exception with string str as a parameter
	
	InvalidAgeException(String str){
		super(str);
	}

}
