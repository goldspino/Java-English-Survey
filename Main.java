import java.util.*;

class Main {
  public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);

System.out.println("What is your percentage in english?");

int x = scan.nextInt();


System.out.println(Grade(x));

  }


public static String Grade(int perc){

if(perc>=90 ){
  return "A";
}

if(perc<90 && perc>=80){
  return "B";
}

if(perc<80 && perc>=70){
  return "C";
}
if(perc<70 && perc>=60){
  return "D";
}
if(perc<60){
  return "F" ;
}

return "missing percentage";

}

}