package Replit;

public class Replit164 {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
return(isAvailable==true||year==2018&&month==7&&day>=1&&day<9?true:isAvailable!=true||year!=2018?false:false);

    }
}//return((isAvailable==false)||(year!=2018)||(month==7)||(day>=1||day<=8)&&(year==2018))?false: true;
/*
To book  a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
 */