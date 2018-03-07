import java.util.Scanner;

class Positive{
  public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int  num = s.nextInt();
        
        if(num<0){
          System.out.println("Negative");
        }else{
          System.out.println("Postive");
        }
        
  }
}
