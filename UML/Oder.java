import java.util.ArrayList;
import java.util.*;


public class Oder {
    private  Date date ;
    private  String status;
    ArrayList<OderDetail> oderDetails=new ArrayList<OderDetail>(10);
    public double calSubTotal(){
        double total =0;
        for(OderDetail order: oderDetails){
            total+=order.calcSubTotal();
        }
        return  total;
    }
    public  void calTax(){

    }
    public void calcTotal(){

    }
    public  void calcTotalWeight(){

    }
}