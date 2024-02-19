package exception;

public class Account {
    private int balance(){
        return balance();
    }
public void setBalance(int balance) {
    this.balance = new balance;
}

// new Exception() : 컴파일 예외
// new RuntimeException() : 런타임 예외
public void withdraw(int money) throws BalancesufficientException{
    if (balance < money) {
        throw new BalancesufficientException("잔액 부족");
    }
}
    
}
