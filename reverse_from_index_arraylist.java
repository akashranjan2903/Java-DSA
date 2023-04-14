import java.util.ArrayList;

// Example of Array list
class reverse_from_index_arraylist{

    static void reverselist(ArrayList<Integer> list, int index){
     
        int end = list.size()-1;
        for (int i=0; i<list.size();i++){
            
            if(i > index && i <= end){
               // swap and decrease the last index
               int temp = list.get(i);  // get the start element
               list.set(i, list.get(end));  // set the end element to the start element
               list.set(end, temp);  // set the end element to the temp element
               end--;
            }
        }
    }
    public static void main (String args []){
   
     ArrayList<Integer> list = new ArrayList<>();
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     list.add(6);

     reverselist(list,1);
     System.out.println("Array list after reverse from index is:" + list);

     for (int i : list){
        System.out.print(i+",");
     }
}
}