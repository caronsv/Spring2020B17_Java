package WarmUp;

public class Pizza {
    String size;
    int topingChees;
    int toppingPepper;
public Pizza(String sizeSmall, String sizeMedium, String sizeLarge,  int topingChees, int toppingPepper){
    this.size=size;
    this.topingChees=topingChees;
    this.toppingPepper=toppingPepper;
}
public double calcost() {
    if (size.equalsIgnoreCase("Small")) {
        return 10 + (1.5 * toppingPepper) + (1 * topingChees);
    } else if (size.equalsIgnoreCase("Medium")) {
        return 12 + (1.5 * toppingPepper) + (1 * topingChees);
    } else {
        return 14 + (1.5 * toppingPepper) + (1 * topingChees);
    }
}
//public String toString(){
//
//
//return ;
    }

