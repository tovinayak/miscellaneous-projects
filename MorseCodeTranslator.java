//Morse Code Translator
import java.util.*;     //importing packages
public class MorseCodeTranslator
{
	public static void main(String[] args) {
		Hashtable<Integer, String> morse=new Hashtable<>();     //initializing hashmap
		morse.put(0,"-----");       //pushing key value pair
		morse.put(1,".----");
		morse.put(2,"..---");
		morse.put(3,"...--");
		morse.put(4,"....-");
		morse.put(5,".....");
		morse.put(6,"-....");
		morse.put(7,"--...");
		morse.put(8,"---..");
		morse.put(9,"----.");
		morse.put(17,".-");
		morse.put(18,"-...");
		morse.put(19,"-.-.");
		morse.put(20,"-..");
		morse.put(21,".");
		morse.put(22,"..-.");
		morse.put(23,"--.");
		morse.put(24,"....");
		morse.put(25,"..");
		morse.put(26,".---");
		morse.put(27,"-.-");
		morse.put(28,".-..");
		morse.put(29,"--");
		morse.put(30,"-.");
		morse.put(31,"---");
		morse.put(32,".--.");
		morse.put(33,"--.-");
		morse.put(34,".-.");
		morse.put(35,"...");
		morse.put(36,"-");
		morse.put(37,"..-");
		morse.put(38,"...-");
		morse.put(39,".--");
		morse.put(40,"-..-");
		morse.put(41,"-.--");
		morse.put(42,"--..");
		Integer ch;
		Scanner sc=new Scanner(System.in);      //new scanner object 
		String input=sc.nextLine();     //taking input from user
		input=input.toUpperCase();      //converting input to uppercase
		for(int i=0;i<input.length();i++)
		{
		    ch=(int)input.charAt(i)-48;     //finding ASCII
		    if(ch==-16)     //checking for space
		        System.out.print(" / ");
		    else
		        System.out.print(morse.get(ch)+" ");        //getting the value of the key
		}
    }
}
