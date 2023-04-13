import java.util.*;
public class reversearraylist{
    public static String reverse(String str){
     // use list to convert string 
     List<String> list = new ArrayList<String>();
      String temp = "";
     for (int i = 0; i < str.length(); i++){
         if (str.charAt(i) == ' ') {
            if (temp != "") {
                list.add(temp);
                temp = "";
            }
            continue;

         }
         else{
         // add to list
           temp+= str.charAt(i);
         }


        }
        // reverse the list using collection
        Collections.reverse(list);
        // return the string
        return String.join(" ", list);
    }

public static void main(String[] args) {
    String str = "  Hello to    World ";
    str= reverse(str);
    System.out.println(str);
    }
}