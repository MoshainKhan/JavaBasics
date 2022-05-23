package con.sparta.mk;

//Written By Mohsin
public class App
{
    public static void main( String[] args )
    {
        int timeofDay=12; // Strongly typed
        String welcomeMessage =greeting(timeofDay);
        System.out.println(welcomeMessage);
    }


    public static String greeting(int timeofDay) {
        String message="";
        if (timeofDay >= 5 && timeofDay <12){
            message ="Good Morning";
        } else if (timeofDay >= 12.00 && timeofDay <=18.00) {
            message ="Good Afternoon";
        } else if(timeofDay>18.01 && timeofDay<=24) {
            message="Good Evening";
        } else{
            System.out.println("Not Valid");
        }
        return message;
    }
}