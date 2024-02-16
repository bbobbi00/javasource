package ch4.account;

import ch4.exam.Account;

System.out.println("부모가 물려준 멤버 변수 child" + child.age);
public class CreditLineAccount extends Account {
    private int creditLine;

    public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;

        // 잔액 = 잔액 + 마이너스 한도
        public coid withdraw(int amount) throws Exception{
            if(getBalance() + creditLine < amount) throw new Exception()
        }


    }
    
}
