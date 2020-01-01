public class SecondsMinutes {
    public static String invalid="Invalid value"; // static field variable 
    
    //create a method that accept two paramters
    public static String getDurationString(int minutes, int seconds){
        /*validate if minutes and seconds are not negative number
        and that seconds is not greater than 59 
        */
            if((minutes<0)||(seconds<0)||(seconds>59)){
                return invalid;
            }
            
                int hours= minutes/60;
                int minutesRemainder=minutes%60;
                
                // test if hours/minutes/seconds is less than 10 and assign 0 if it is 
                String hoursRanger= hours+ "h ";
                if(hours<10){
                    hoursRanger="0"+hoursRanger;
                }
                String minutesRanger= minutesRemainder+ "m ";
                if(minutesRemainder<10){
                    minutesRanger="0"+minutesRanger;
                }
                String secondsRanger= seconds+ "s ";
                if(seconds<10){
                    secondsRanger="0"+secondsRanger;
                }
            String valid= hoursRanger + minutesRanger + secondsRanger;
                return valid;       
    }
    /*create an overloaded method that has the same name
    with the first method but accept only one parameter "seconds" 
    */
    public static String getDurationString(int seconds){
      // validate if seconds is not equal to negative number
      if(seconds<0){
          return invalid;
      }
      int minutes= seconds/60;
      int secondsRemainder= seconds%60;
      // call the overloaden method and assign it to a string variable valid
      String valid= getDurationString(minutes,secondsRemainder);
      return valid;
    }
    public static void main(String args[]){
        System.out.println(getDurationString(61,59));
        System.out.println(getDurationString(3600));
    }
}
   
   
