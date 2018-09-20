public class Calculator{
       public static void main(String[] args) {
       	
            int numberOne =2;
            char sign='^';
            int numberTwo=3;
           
            if (sign=='+'){
            	System.out.println(numberOne+numberTwo);
            }else if (sign=='-'){
            	System.out.println(numberOne-numberTwo);
            }else if (sign=='/'){
            	System.out.println(numberOne/numberTwo);
            }else if (sign=='*'){
            	System.out.println(numberOne*numberTwo);
            }else if(sign=='%'){
            	System.out.println(numberOne%numberTwo);
            }else if(sign=='^'){
            	int count=1;
            	for(int i=0;i<numberTwo;i++){
            		count=numberOne*count;
            	}
            	System.out.println(count);
            }
       }
}