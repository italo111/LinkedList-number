
package central;

public class App {

    public static void main(String[] args)throws CloneNotSupportedException {
       HugeInt myList = new HugeInt();
       myList.setValue(2345);
       System.out.println(myList.getValue());//returns 2345
       HugeInt myList2 = new HugeInt();
       myList2 = myList.clone();
       // generates another object called myList2 with same attributes
       //as myList object
       System.out.println(myList2.getValue());//returns 2345
       System.out.println(myList.log());//returns 4 elements
       myList2 = myList.modExp(1);
       System.out.println(myList2.getValue());
     System.out.println(myList2.recursiveModNine(myList2.getValue()));
     //returns 5
    System.out.println(myList2.recursiveModThree(myList2.getValue()));
    //returns 2
    }
    
}
