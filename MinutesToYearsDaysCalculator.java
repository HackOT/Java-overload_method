public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        
        if (minutes >= 0){
            Long day = minutes / (24*60); 
            int year = (int) (day / 365);
            int remainDay = (int) (day % 365);

            System.out.println(minutes + " min = " + year + " y and " + remainDay + "d");
            
        }
        
        System.out.print("Invalid Value");
    }
    
}
