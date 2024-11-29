package customexception;

class InsufficientBalanceException extends Exception {
	private String message;
	InsufficientBalanceException(String message){
		this.message = message;
	}
        
	public String getMessage(){ // constructor is private 
		return message;
	}

}
