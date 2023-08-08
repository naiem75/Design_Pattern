public abstract class BeverageBuilder
{

 private Beverage beverage;

 public Beverage getBeverage()
 {
 return beverage;
 }

 public void setBeverage( Beverage beverage )
 {
 this.beverage = beverage;
 }

 /*
  * Template method that creates Beverage Object and returns Beverage
  * Object after adding components in required proportion.
  */
 public final Beverage buildBeverage()
 {
 Beverage beverage = createBeverage();
 setBeverage(beverage);
 setBeverageType();
 setWater();
 setMilk();
 setSugar();
 setPowderQuantity();
 return beverage;
 }

 abstract void setBeverageType();

 abstract void setWater();

 abstract void setMilk();

 abstract void setSugar();

 abstract void setPowderQuantity();

 abstract Beverage createBeverage();

}


