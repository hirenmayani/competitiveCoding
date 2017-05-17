package HackerRank;
import java.io.*;    
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LaptopBatteryLife {

    public static void main(String[] args) throws Exception{
        double fullBatteryTime = 8.0;
        double fullBatteryChargeTime = fullBatteryTime;
        FileInputStream fstream = new FileInputStream("C:\\Users\\hiren_mayani\\workspace\\HackerRankDP\\src\\trainingdata.txt");                     
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        double ratio = 2.0;
        while ((strLine = br.readLine()) != null)   {
          String[] hours = strLine.split(",");
          double chargeTime = Float.parseFloat(hours[0]);
          double batteryLife = Float.parseFloat(hours[1]);
          if(batteryLife == fullBatteryTime) {
              if(chargeTime < fullBatteryChargeTime)
                  fullBatteryChargeTime = chargeTime;
          } else if(batteryLife != 0.0) {
              ratio = (ratio + (batteryLife/chargeTime))/2;
          }    
        }
     
        in.close();  

        
        Scanner scanner = new Scanner(System.in);
        Double chargeTime = Double.parseDouble(scanner.nextLine());
        Double batteryLife = fullBatteryTime;
        if(chargeTime <= fullBatteryChargeTime)
            batteryLife = chargeTime*ratio;
        System.out.println(batteryLife);
        
 
    }
  
}