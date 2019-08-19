# LinkedList-number
this project gets a number from the user, and stores that number in a LinkedLyst of bytes. each digit of the number will be stored as a byte. you can get the value of this number by using the getValue() method, in which it takes all the digits from the list, puts it in a string, and converts it back into a number. \n
We can also clone the object by using the clone() method that returns the copy of that object.
we can use the log() method that counts the number of digits in the LinkedList
the modExp(long n) method gets the value of the LinkedList called num ,then find the modulus of num % Math.pow(10,n), then puts this number into a newObject with the setValue method. then returns this newObject.
the quotientExp(long n) method gets the value of the LinkedList called num, then find: num/Math.pow(10,n), then puts this number into a newObject with the setValue method. then returns this newObject
the add(HugeInt h) method gets  the value of the LinkedList called num, gets the value of the h object called num2, then adds num + num2
then sets the new value into the invoked object LinkedList
the recursiveModNine(int num) method  finds num% 9. to reach to the result it uses a very interesting algorithm of recursion.
in which it adds all the digits of that number
