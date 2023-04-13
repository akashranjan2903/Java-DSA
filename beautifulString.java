import java.util.Scanner;
import java.util.*;

public class beautifulString {
static char s1 = '0';
static char s2 = '1';
static int t1,t2;

public static char[] changeZero(int index, char[] temparray){

    if (temparray[index] == '1' && s1 == '0'){//01011
        s1 = '1';
        
    }
    else if (temparray[index] == '0' && s1 == '1'){
    s1 = '0';
    }
    else{
    if (s1 == '0'){
        temparray[index] = '1';
        s1 = '1';
        t1++;

    }
    else{
        temparray[index] = '0';
        s1 = '0';
        t1++;

    }
    }
    return temparray;
}
public static char[] changeone(int index, char[] temparray){
    
    if (temparray[index] == '1' && s2 == '0'){
        s2 = '1';
        
    }
    else if (temparray[index] == '0' && s2 == '1'){
    s2 = '0';
    
    }
    else{
    if (s2 == '0'){
        temparray[index] = '1';
        s2 = '1';
        t1++;
    }
    else{
        temparray[index] = '0';
        s2 = '0';
        t1++;
    }
    }
    return temparray;
}
public static void main (String [] args){
// taking string input from user
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
// convert the string into char array
char strarray [];
strarray = str.toCharArray();
// 1001010 

char [] temparr =  Arrays.copyOf(strarray,strarray.length);
char [] temparray  =  Arrays.copyOf(strarray,strarray.length);

for (int i=1; i<strarray.length;i++){
        if (temparray[0] == '0'){ 
            
            temparr= changeZero(i,temparr);
        
        }
        else{
            
            temparr= changeone(i,temparr);

        }
        System.out.println("1st beautify"+String.valueOf(t1));
        
}
s1 = '0';
s2 = '1';
t2 = t1;
t1 = 0;
temparr =  Arrays.copyOf(strarray,strarray.length);
temparray =   Arrays.copyOf(strarray,strarray.length);
for (int i=0; i<strarray.length;i++){
        if (temparray[0] == '0'){ //01011
        
            temparr= changeZero(i,temparr);


        
        }
        else{
            
            temparr= changeone(i,temparr);

        }
        System.out.println("2st beautify"+String.valueOf(t1));

}

// max of t1 and t2 
int min =Math.min(t1, t2);
System.out.println("MINIMUM operation to make str beautiful is" + min);
}
}
