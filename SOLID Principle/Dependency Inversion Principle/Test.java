public class test {

    public static void main(String[]args){

    BankCard bankcard=new BankCard();
    ShoppingMall shoppingMall=new ShoppingMall(bankcard);
    shoppingMall.transaction("do some order",4440);
    
}

}