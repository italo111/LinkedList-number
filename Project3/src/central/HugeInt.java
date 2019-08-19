package central;
import java.util.LinkedList;
import java.util.ListIterator;
public class HugeInt {
    private LinkedList<Byte> list;
    public HugeInt(){
       list = new LinkedList<Byte>();

    }
    public void setValue(int value){
       //gets an int and puts each individual integers into a list
        String str = Integer.toString(value);// convert to string
         for(int i = 0; i < str.length(); i++){
              list.addLast((byte)(str.charAt(i)));
              //get each char and convert it to byte then put it on the list
         } 
    }
    
    public void setValue(long value){
        String str = Long.toString(value);
        for(int i = 0; i< str.length(); i++){
            list.addLast((byte)(str.charAt(i)));
            
        }
    }
    public int getValue(){
        //from the list takes all the digits and converts it into a number
        char c;
        byte b;
        String str = "";
        ListIterator<Byte> iterator = list.listIterator();
        while(iterator.hasNext()){
            b = iterator.next();//gets the byte
            c = (char)b;//byte converted to char
            str = str + Character.toString(c);//convert from char to string
            
        }
        long number = Long.parseLong(str);
        //if number is bigger than an int can handle return -1
        if(number > 32767){
            return -1;
        }
        else{
            return (int)number;
        }
    }

    
    
    public HugeInt clone()
    {
       HugeInt newObject = new HugeInt();//creates new object
       int num = this.getValue();//retrieves the number from the list
       newObject.setValue(num);//puts the number on the list of the newObject
       return newObject;
    }
    
    
    public long log(){
        //method returns the number of items in the list
        int count = 0;
        for(byte temp:list){
            count++;
        }
        return count;
    }
    public HugeInt modExp(long n){
        int num = this.getValue();//gets the value from the list
        int temp;
        temp = num%(int)(Math.pow(10,n)); //creates a new number
        HugeInt newObject = new HugeInt();
        newObject.setValue(temp);//puts the number inside the list of newObject
        return newObject;//returns a new object with a different list
    }
    
     public HugeInt quotientExp(long n){
         //the number taken from the list divide it by 10^n
         //and put that on a new object , and return that new object
         int num = this.getValue();
         int temp = num/(int)(Math.pow(10,n));
         HugeInt newObject = new HugeInt();
         newObject.setValue(temp);
         return newObject;
     }
     public HugeInt timesExp(long n){
         //similar to quotientExp(long n)method
         int num = this.getValue();
         int temp = num*(int)Math.pow(10,n);
         HugeInt newObject = new HugeInt();
         newObject.setValue(temp);
         return newObject;
     }
     public HugeInt add(HugeInt h){
         //get value from object h
         int num = h.getValue();
         int num2 = this.getValue();//get value from the invoking object
         int result = num+num2;
         HugeInt newObject = new HugeInt();
         newObject.setValue(result);//put result in new object
         return newObject; //return new object
     }
     public void addSet(HugeInt h){
         int num = this.getValue();//get value from invoking object
         int num2 = h.getValue();
         int result = num + num2;
         this.setValue(result);//put result in the invoking object
     }
     public  int recursiveModNine(int num){
       //gets a number num and returns num%9
       //uses recursion
         int count = 0;
        int num2;
        //minimum value of recursion  which is a single digit
        //returns the single digit mod 9 
        if(num < 10){
            return num%9;
        }
        String str = Integer.toString(num);//convert int to String
        for(int i = 0; i < str.length(); i++){
            //gets a char from a string and converts it to int
            num2 = Character.getNumericValue(str.charAt(i));
            count = count + num2; //sum each separate integer from the whole
            //number 
        }
      
         num2 = recursiveModNine(count);//recursion
        
        return num2;
     
    }
     public int recursiveModThree(int num){
         //similar method as recursiveModNine(int num) method
         int count = 0;
         int num2;
         if(num < 10){
             return num%3;
         }
         String str = Integer.toString(num);
         for(int i = 0; i< str.length(); i++){
             num2 = Character.getNumericValue(str.charAt(i));
             count = count + num2;
         }
         num2 = recursiveModThree(count);
         return num2;
     }
     
}
   
    


