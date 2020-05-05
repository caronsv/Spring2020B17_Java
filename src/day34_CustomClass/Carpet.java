package day34_CustomClass;

public class Carpet {
    double width;
    double length;
    double untilPrice;
    boolean isPersian;
    public  double calcCost(){
        double total=(width+length)*untilPrice;
       if (isPersian){
            return total+200;
        }else{
            return total;
        }


        //return total;
       // return (isPersian)?total:total;
        }
        public void customOrder(double CarpetWidth,double CarpetLength, double CarpetUnitPrice, boolean CarpetPersian){
        width=CarpetWidth;
        length=CarpetLength;
        untilPrice=CarpetUnitPrice;
        isPersian=CarpetPersian;
        }
        public String toString(){
        return "width: "+width+
                "\nlength: "+length+
                "\nunit price $"+ untilPrice+
                "\ncosts $"+calcCost();
        }


    }

