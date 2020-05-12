package day38_Constructors;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }
    public  double calcCost(){

        return quantity*unitPrice;
    }
    public String toString(){
        return "Item"+", Unit price: $"+unitPrice+", Quanity: "+quantity+
                "\nTotal Cost of Item: $"+calcCost();
    }
}
