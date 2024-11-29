package customexception;

class InvalidPasswordException extends RuntimeException {
	private String message;
	InvalidPasswordException(String message){
		this.message = message;
	}
	@Override
	public String getMessage(){  //constructor is private 
		return message;
	}

}

//unchecked -> class InvalidPasswordException extends RuntimeException {}
//checked -> class InvalidPasswordException extends Exception {}