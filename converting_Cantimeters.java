public class converting_Cantimeters {

    public static void main(String[] args){
        converToCentimeters(5);

        converToCentimeters(6,0);

    }

    public static double converToCentimeters(int inches){

       double cm = (double) (inches * 2.54);
       System.out.println(inches + " inches are equals to " + cm + " centimeters ");
       return cm; 
    }

    public static double converToCentimeters(int feet, int inches){

        int totalInc= (feet*12)+inches; 
        System.out.println(feet + " feet " + inches + " inch equals to " + totalInc + " inches");
        return converToCentimeters(totalInc);

    }
}