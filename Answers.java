
/**
 * Write a description of class Answers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Question 28:
 *  for(String filename : tracks)
 * 
 * Question 29:
 *  boolean found = false;
 *  while(!found){
 *      if(the keys are in the next place) {
 *          found = !true;
 *      }
 *  }       
 * 
 */

public class Answers{
    //Question 30
    public void multiplesOfFive() {
        int count = 10;
        while(count <= 95) {
            if(count % 5 == 0) {
                System.out.println(count);
            }
            count = count + 1;
        }
    }
    
    //Question 31
    public void printSum() {
        int sum = 0;
        int value = 1;
        while(value <= 10) {
            sum = sum + value;
            value = value + 1;
        }
        System.out.println(sum);
    }
    
    //Question 32
    public int sum(int a, int b) {
        int sum = 0;
        while(a < b) {
            a = a + 1;        //"all between" so increment starts before calc
            sum = sum + a;
        }
        
        while(b < a) {
            b = b + 1;        //"all between" so increment stats before calc
            sum = sum + b;
        } return sum;
    }
    
    //Question 33
    public boolean isPrime(int n) {
        int a = 2;
        int b = n-1;
        while(a <= b) {
            if(n % a == 0) {
                return false;
            }
            a = a + 1;
        } return true;
    }
    
    
}
