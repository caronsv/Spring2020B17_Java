package day09_Nestedif_Ternary;

public class ageGroups {
        /*                  baby (< 3 year)
                           Toddler (3 - 5),
                            Kid (6 - 9),
                            Pre-Teen (10 - 12),
                            Teenager (13 - 17),
                            Young Adult (18 - 20),
                            Adult (21 - 39),
                            Young Middle-Aged Adult (40 - 49),
                            Middle-Aged Adult (50 - 54),
                            Very Young Senior Citizen (55 - 64),
                            Young Senior Citizen (65 - 74),
                            Senior Citizen (75 - 84),
                            Old Senior Citizen (85+)
        */
        public static void main(String[] args) {
            int age=100;
            String agrGroup=" ";

            if (0< age && age<3){
                agrGroup="baby";
            }else if(age>3 && age<=5) {
                agrGroup="Toddler";
            }else if(age>=6 && age<=9) {
                agrGroup="Kid";
            }else if(age>=10 && age<=12) {
                agrGroup="Pree-Teen";
            }else if(age>=13 && age<=17) {
                agrGroup="Teenager";
            }else if(age>=18 && age<=20) {
                agrGroup="Young Adult" ;
            }else if(age>=21 && age<=39) {
                agrGroup="Adult";
            }else if(age>=40 && age<=49) {
                agrGroup="Young-Middle-Aged Adult";
            }else if(age>=50 && age<=54) {
                agrGroup="Middle-Aged Adult";
            }else if(age>=55 && age<=64) {
                agrGroup="Very Young Senior Citizen";
            }else if(age>=65 && age<=74) {
                agrGroup="Young Senior Citizen";
            }else if(age>=75 && age<=84) {
                agrGroup="Senior Citizen";
            }else if(age>=85 && age<=119) {
                agrGroup="Old Senior Citizen";
            }else {
                agrGroup = "Invalid entry";
            }
            System.out.println(agrGroup);
            boolean eligibleToBuy =  agrGroup == "Adult" || agrGroup == "Young Middle-Aged Adult" ||
                    agrGroup == "Middle-Aged Adult";

            if(eligibleToBuy){
                System.out.println("You are eligible");
            }else {
                System.out.println("You are not eligible");
            }

    }
}
