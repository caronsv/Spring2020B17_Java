package day25_MethodRecap;
/*
Warm up tasks:
	1. write a return method named getDriver1 that accepts a string parameter called Browser
			if the browser name matches with {"chrome", "firefox", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
				Ex: getDriver("chrome");  ==> "Chrome Driver"
					getDriver("fireFOX"); ==> "FireFox Driver"
						....
			if the browser name does not match with any of browsers above, the method should return "Invalid"
			APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements
 */
public class Driver {

    /*
    method decleration:
            Access-modifers  Specifier  return-Type  MethodName(paramter){
                    statements;
            }
     */
    public static void main(String[] args) {
        //  getDriver1(); //argument is mandatory

      String str=  getDriver1("firefox");
        System.out.println(str);

      String str2=getDriver2("ChRome");
        System.out.println(str2);

        String str3=getDriver3("Firefox");
        System.out.println(str3);

    }



    public static String getDriver1(String browserName) {


        switch(browserName.toLowerCase()){  //(browserName.toLowerCase())
            case "chrome":return "Chrome Driver";

            case "firefox": return "Firefox Driver";

            case "safari": return "Safari Driver";

            case "opera": return "Opera Driver";

            case "edge": return "Edge Driver";

            default:return "Invalid Driver";

        }}



    public static String getDriver2(String browersName){
        browersName=browersName.toLowerCase();

        if (browersName.equalsIgnoreCase("chrome")){
            return "Chrome Driver";
        }else if (browersName.equalsIgnoreCase("firefox")){
            return "Firefox Driver";
        }else if (browersName.equalsIgnoreCase("safari")){
           return "Safari Driver";
        }else if (browersName.equalsIgnoreCase("edge")){
           return "Edge Driver";
        }else if (browersName.equalsIgnoreCase("opera")){
            return "Opera Driver";
        }else{
            return  "Invalid Driver";
    }


}
    //:()?, : ,  ()?
public static String getDriver3(String browserName){
        browserName=browserName.toLowerCase();
        return (browserName.equals("chrome"))?"Chrme Driver"
                :(browserName.equals("firefox"))?"Fiferfox Driver"
                :(browserName.equals("safari"))?"Safari Driver"
                :(browserName.equals("edge"))?"Edge Driver"
                :(browserName.equals("opera"))?"Opera Driver"
                :"Invalid Driver";


}
    }


