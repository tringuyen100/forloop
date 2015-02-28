import java.util.Scanner;
 
public class askad {
     
    public static void scan()
    {
           String user = null;
           String password=null;
           boolean isValid;
           int i=0;
            
           Scanner in = new Scanner(System.in);
         
           for (i=0; i<3; i++)
           {
               if(i!=0)
               {
               System.out.println("Invalid user: That was attempt nr " +i);
               }
                
                   if(i==2)
                   {
                   System.out.println("This " +(++i) + "rd login will be your final attempt");
                   }
               //System.out.println("Counter i is: " +i);
                        
                   System.out.print("Enter your user name: ");
                   user = in.nextLine();
                    
                   System.out.print("Enter your password: ");
                   password=in.nextLine();
                    
                   isValid = isValidCred(user,password);         
                   if(isValid)
                        
                   {
                       System.out.println("Welcome "+user);
                       break;
                   }
            
                
               if(i==3)
               {
                   System.out.println("You had " + i + " failed attempts");  
               }
                   
                   }//for loop ends here
           
           in.close();
        }    
 
     
    public static boolean isValidCred(String n, String p)
    {
         
        if (n.equals("raja") && p.equals("k9"))
        {
            return true;
        }
        else
        {
            return false;
        }
        }
             
    public static void main(String[] args) 
    {
        System.out.println("You have 3 attempts to logon");  
        scan();
    }
}



