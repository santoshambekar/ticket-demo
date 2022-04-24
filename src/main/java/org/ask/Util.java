package org.ask;

public class Util {
	public static final String SUCCESS = "Success";
	public static final String FAIL = "Fail";
	
	public static boolean isNullOrEmpty(Object obj) {
		if (obj == null) {
			return true;
		}

		return (obj instanceof String) && ((String) obj).trim().length() == 0;
	}
	
	public static boolean notNullOrEmpty(Object obj) {
		return !isNullOrEmpty(obj);
	}
}
