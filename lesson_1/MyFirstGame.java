

public class MyFirstGame{
	public static void main(String[] args) {


            int numberComp = 7;
            int numberMy=6;
            while (true){
              if (numberComp>numberMy){
              	System.out.println("your number is to small");
                numberMy++;
                
              }else if(numberComp<numberMy){
              	System.out.println("your number is to big");
              	numberMy--;

              }else if(numberComp==numberMy){
                  System.out.println("you guessed");
                  break;
              }
            }

        }
        
}