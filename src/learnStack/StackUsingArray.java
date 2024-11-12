package learnStack;

public class StackUsingArray {
    int[] arr = new int[10];
    int capacity = arr.length;
    int top = -1;

     boolean push(int n){
        if(top>=capacity-1){
            return  false;
        }
        else {
            arr[++top] = n;
            return  true;
        }
    }

     int pop() {
         if(top<0){
             System.out.println("stack underflow ");
             return 0;
         }
         else {
             return arr[top--];
         }

    }
    int peek(){
        if(top<0){
            System.out.println("stack underflow ");
            return 0;
        }
        else {
            return arr[top];
        }
    }
    void print(){
         for(int i=top;i>=0;i--){
             System.out.println(arr[i]);
         }
    }
}
