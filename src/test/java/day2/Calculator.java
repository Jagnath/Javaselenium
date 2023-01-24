package day2;

public class Calculator {
    public static void main(String[] args) {

        Calculator cal=new Calculator();
        cal.addNumbers(20,40);
        cal.subNumbers(40,20);
        cal.mulNumbers(10,30);
        cal.divNumbers(30,10);


        }
        public void addNumbers(int x,int y){
        int sum=x+y;
        System.out.println("sum " + sum);
        }
        public void subNumbers(int x,int y){
        int sub=x-y;
        System.out.println("sub" + sub);
        }
        public void mulNumbers(int x,int y){
        int mul=x*y;
        System.out.println("mul " + mul);
        }
        public void divNumbers(int x,int y){
        int div=x/y;
        System.out.println("div" + div);
        }
    }

