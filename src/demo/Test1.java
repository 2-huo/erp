package demo;

import java.util.Stack;

public class Test1 {
	
   public static void main(String[] args) {
	int[] array= {3,6,8,0,7,9,56,34,55,90};
	reOrderArray(array);
	
}
   public static void reOrderArray(int [] array) {
       int num = array.length;
       int[] barry = new int[num];
       Stack<Integer> stack1=new Stack<Integer>();
       Stack<Integer> stack2 = new Stack<Integer>();
       for(int i =0;i<num;i++){
           if(array[i]%2==1){
               stack1.push(array[i]);
           }else{
               stack2.push(array[i]);
           }
       }
       while(!stack2.empty()){
           num--;
           barry[num]=stack2.pop();
       }
        while(!stack1.empty()){
           num--;
           barry[num]=stack1.pop();
       }
       for(int i=0;i<array.length;i++){
           System.out.print(barry[i]+" " );
       }
       
   }
}