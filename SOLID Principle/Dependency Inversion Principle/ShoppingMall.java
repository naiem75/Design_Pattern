public class ShoppingMall {

    private BankCard bankcard;
    public ShoppingMall(BankCard bankcard){
        this.bankcard=bankcard;
    }
    public void transaction(Object order,int amount){
        bankcard.transaction(amount);
    }


}