public class BankService {


    private String username;
    private String password;
    long amount;
    String accountNo;

    public void  login(int username, int password)
     {
         this.username= String.valueOf(username);
         this.password= String.valueOf(password);
     }
     public long deposit(long amount,String accountNo){

        this.amount=amount;
        this.accountNo=accountNo;
        return amount;
     }
     public long withDraw(long amount, int accountNo){
         this.amount=amount;
         this.accountNo= String.valueOf(accountNo);
         return amount;
     }
}