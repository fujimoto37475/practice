public class Computer extends TangibleAsset{
	private int lotNumber;

  public Computer(String name , int price , String color , int lotNumber){
	  super(name , price , color);
	  setLotNumber(lotNumber);
  }

  public String getLotNumber(){
	  return this.lotNumber;
  }
  public void setLotNumber(int lotNumber){
	  this.lotNumber = lotNumber;
  }
}
