/**
 * Main
 */
public class ll {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello ");
        System.out.print("aryanbhat /n"); // works just as print ln ie starts from new line

        int x = 1 ;
        boolean y = true;
        float z = 1.0f;

        System.out.printf("%d",x); 
        System.out.printf("%s",y);
        System.out.printf("%f",z);

        int x2 = 1;
        int x1 = 3;

        System.out.println(x2+x1); //
        System.out.println(x2*x1);
        System.out.println("aryan"+x2+x1);
        
        System.out.println("aryan \\) bhat"); // /" escapes squecnces(ES) can be justified using / but sometimes if its not a  ES then we can use doublle slaash
        System.out.println("aryan \\n bhat"); // double slashes are used for single line comments 
        /* but when we use a slash and mulpiply we can use it for multi line comments like 
         this you can see here
          i have been in multiple 
          in multiple lines
         */
         
        System.out.println(67*21);

        /*java variables
         datatype name = value
         if i want to assign muktiple variables i can just
        */
        int u1=0,u2=01,u3=61;
        int u4,u5,u6;
       u4=u5=u6=0; // when assigning a same value to multiple variabes 




// string pool
        String a1 = "gopu"; //immutable type
        a1="gopal";
        System.out.println(a1);


        int a2 = 69; //mutable
        a2=83;
        System.out.println(a2);
        float a3 = 1.0f;
        char a4 = 'r';
        boolean a5 = false;
        long a6= 500000L;


        /*final varriabale
         final int h1=0;
         h1=1;
         final variables cannot be changes*/
          
         // radius =11 pi=3 calculate perimeter
         int r1=11;
         int pi=3;
         System.out.println(2*r1*pi);

         






 



       

    }
}