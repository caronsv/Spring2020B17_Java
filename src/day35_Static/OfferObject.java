package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","BOA",100000,true);
        Offer offer2=new Offer();
        offer2.setInfo("VKY","Capital",120000,true);
        Offer offer3=new Offer();
        offer3.setInfo("MD","Chase",95000,true);
        Offer offer4=new Offer();
        offer4.setInfo("CA","FB", 140000,false);

        Offer[] offers={offer1,offer2,offer3,offer4};
        String myLocation="VA";
        ArrayList<Offer>Accept=new ArrayList<>(Arrays.asList(offers));
      //  Accept.removeIf(p->p.salary<100000&&p.isFullTime==false);
        Accept.removeIf(p->p.salary<100000);
        Accept.removeIf(p->p.isFullTime==true);
        Accept.removeIf(p->p.location.equals(myLocation));
        Accept.removeIf(p->p.company.equals("Capital "));
       // System.out.println(Accept.size());
        for (Offer eachOffer:Accept){
            System.out.println(eachOffer);

        }


    }
}
