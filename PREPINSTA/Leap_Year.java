public class Leap_Year {
    public static void main(String[]args)
    {
        int year = 2005;
        
        
        //using ifelse statement
        /* 
        if(year % 400 == 0)
            System.out.println("it is leap year");
        else if(year % 4 == 0)
            System.out.println("It is an leap year");
        else
            System.out.println("it is not an leap year"); 
        */ 
        


        ////using ifelse statement2 
        /* 
        if ((year %400 == 0) || (year %4 ==0))
            System.out.println("it is an leap year");
        else
            System.out.println("it is not an leap year");    
        */
        
        
        // using ternary operator;
        int n = (year %400 == 0) || (year %4 ==0) ? 1:0;
        if(n==1)
            System.out.println("it is an leap year");
        else 
            System.out.println("it is not an leap year");    
    }


    
}
