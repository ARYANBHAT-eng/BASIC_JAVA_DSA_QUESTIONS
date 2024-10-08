/**
 * Larva
 */
public class Larva {

    public static void main(String[] args) {
        



//operator % stands for reminder
int o1=10,o2=3;
System.out.println(o1%o2); // it will show reminder

int value =69;
// ++value/--value (pre incremenet/decreement) value++/value-- (post increment/decreement )
System.out.println(value++); //69 
System.out.println(++value); //71
System.out.println(--value); //70
System.out.println(value++); //70 
System.out.println(value--); // 71 
System.out.println(value); //70
System.out.println(value--); //70


int val1=1002,val2=1005,val3=1007,val4=1009;
 System.out.println(val1=val2); // assigns
 System.out.println(val2==val4); //compares
 System.out.println(val3!=val4); //notequal
 System.out.println(val3>=val2); //  checks for greater then or equal to and if = is not present it will just show if its grrater or not 
// therefore loggically we can use <,>,<=,>=.

// && and || or
int e1=100,e2=101,e3=102,e4=100;
 System.out.println(e1==e4 || e2==e3);
 System.out.println(e1==e4 && e2<=e3);

 int vall1=2,vall2=6,vall3=5,vall4=3;
 System.out.println(vall1+=vall2);
 System.out.println(vall1-=vall2);
 System.out.println(vall3&vall4);
 System.out.println(vall3|vall4);

 String txt="iwantodrink9pegstodayifitspossible.";
 System.out.println("the length of the line above i have written is:-" +txt.length());
 // this helps us to calculate the length of the string we have written above

    }}