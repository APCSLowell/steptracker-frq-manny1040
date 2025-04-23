import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
private int s, total;
private int d, ad;
 
public StepTracker(int s1){
 s = s1;
 int total = 0;
 int ad = 0;
 int d = 0;
}
public void addDailysSteps(int spd){
 total = total + spd;
 d++;
 if(spd >= s)
   ad++;
}
public int activeDays(){
 return ad;
}
public double averageSteps(){
 if(total == 0)
  return 0.0;
 else
  return (double)total/d;
 }
}
 
