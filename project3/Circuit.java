/* 
 * This is the Circuit class that you have to create
 * for Problem 3
 * 
 * name: Amir Moradi
 * UNI: am6040
 * 
 */

public class Circuit{
    
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;

    
    
    public Circuit(){
        // this is the constructor
        // initialize all switches to down and light to off
        // your code here
      int firstSwitchState = 0; // Assume initially both switches are down
      int secondSwitchState = 0;
      int lampState = 0; // Light is initially off
    }
    
    public void toggleFirstSwitch(){
        // this is a mutator method
        // that toggles the first switch
        firstSwitchState = (firstSwitchState == 0) ? 1 : 0;
        // Toggle the lamp state
        lampState = (lampState == 0) ? 1 : 0;

    }
    
    public void toggleSecondSwitch(){
        // this is a mutator method
        // that toggles the second switch
        secondSwitchState = (secondSwitchState == 0) ? 1 : 0;
        // Toggle the lamp state
        lampState = (lampState == 0) ? 1 : 0;
    }
    
    public int getLampState(){
        // this is an accessor method for the lamp state
        // your code here
        return lampState;
          
    }
  
    public int getFirstSwitchState(){
        // this is an accessor method for the first switch
        // your code here
        return firstSwitchState;
    }    
   
  
    public int getSecondSwitchState(){
        // this is an accessor method for the second switch
        // your code here
        return secondSwitchState;
    }
  
}