package customexception;

class InvalidMarksException extends Exception {
	private String message;
	InvalidMarksException(String message){
		this.message = message;
	}
	public  String getMessage(){
		return message;
	}

}
