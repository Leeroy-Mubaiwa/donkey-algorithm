/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donkeyalgorithm;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author theresa
 */
public class DonkeyAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        String ban[] = new String [12];
        char donkey = (65+23);
        int hen=1;
        for(int t = 0; t<ban.length;t++)
        {
            if(t>= 0 && t<= 1)
            {
                ban[t] = "Donkey" + donkey;
                donkey++;
               
            }else
            {
                ban[t] = "Hen-" + (hen);
                hen++;
            }
            
            //to check for presence in the array
            System.out.println("Location--"+t+"---"+ ban[t]);
        }
        
        String pan[][] = new String[2][2];

        Date date = new Date();
        if (date.getHours() >= 6) {

            /////To let out the donkeys
            pan[0][0] = ban[0];
            pan[1][1] = ban[1];
            ban[0]=null;
            ban[1]= null;
            System.out.println
 ("\n"+pan[0][0] + " and " + pan[1][1] + " are now in Pan 1 and 2 respectivley at " + LocalTime.now() + " now waiting for 6pm...");
           
////to let out hens one by one
            for(int hens_out = 2; hens_out<=ban.length-2;hens_out++)
            {
                ban[hens_out] =null;
            }
            System.out.println("\nHens are now out at " + LocalTime.now() + " now waiting for 12pm...");

            
        }
        
        if (date.getHours() >= 12) {
            hen = 1;
            
                for(int hens_in = 2; hens_in<=ban.length-2;hens_in++)
            {
                ban[hens_in] = "Hen-" + hen;
                hen++;
            }
                   System.out.println("\nIts now after 12 hens are back in at " + LocalTime.now());
            }
        if(date.getHours() >= 18)
        {
            ban[0]=pan[0][0];
            ban[1] = pan[1][1];
            System.out.println("\nIts now evenigs "+ban[0] +" and "+ ban[1] +" are now back in the ban at"  + LocalTime.now());
        }
            
        
            
            
          
    }

}
