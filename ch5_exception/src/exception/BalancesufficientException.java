package exception;

public class BalancesufficientException extends Exception {
    public BalancesufficientException(){
        super();
    }
    public BalancesufficientException(String message){
        super(message);
    }
}
