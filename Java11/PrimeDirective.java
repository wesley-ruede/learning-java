import java.util.ArrayList;

class PrimeDirective {
  
  public boolean isPrime(int number){
    // edge case
    if (number == 2){
      return true;
    } else if (number < 2){
      return false;
    }
    
    // check from 2 to n-1
    for (int i = 2; i < number; i++){
      if (number % i == 0)
        return false;
    }
    return true;
  }

  public ArrayList<Integer> onlyPrime(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers){
      if (isPrime(number)){
        primes.add(number);
      }
    }
    return primes;
  }
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    // use case
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    System.out.println(pd.isPrime(numbers[3]));
    System.out.println(pd.onlyPrime(numbers));
  }  
}