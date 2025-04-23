import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int s;
public StepTracker(int s1){
 s = s1;
}
public int addDailysSteps(int spd){
 int total = 0;
 int ad = 0;
 int d = 0;
 total = total + spd;
 if(spd >= s)
   ad++;
   d++;
 else 
   d++;
}
public int activeDays(){
 return ad;
}
public double averageSteps(){
  return (double)total/d;
 }
}
 
