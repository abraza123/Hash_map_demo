import java.util.*;
import java.util.HashMap;
import java.lang.*;

public class InnerClasses{
public static void main(String[] args) {
    


    HashMap<Integer, String> myMap = new HashMap<Integer, String>();
    myMap.put(1000, "Bughatti Chiron");
    myMap.put(200, "Bentley");
    myMap.put(70, "Range Rover");
    myMap.put(100, "Lambo truck");
    myMap.put(50, "Mercedes");
    myMap.put(40, "BMW");
    myMap.put(30, "Kia");
    myMap.put(20, "Honda");
    


    System.out.println("Enter how much you can afford for a car: ");
    
    Scanner input = new Scanner(System.in);
    
    int myInput = input.nextInt();

    if(myMap.containsKey(myInput)){
        System.out.println("Congrats you can afford a: " + myMap.get(myInput));

    
    }

    else {
        System.out.println("You are too broke do not buy a car");
    }








input.close();

}





}



