package altimetrik.raj;

public class Main {

    /*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.


TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.*/
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(2.345,2.3456));
    }

    private static boolean areEqualByThreeDecimalPlaces(double v, double v1) {

        int u= (int) (v*1000);
        int u1=(int)(v1*1000);
        if (u==u1){
            return true;
        }
        else{
            return false;
        }
    }
}
