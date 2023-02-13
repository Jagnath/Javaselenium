package day10;

public class Assignment {
    public static void main(String[] args)
    {

        String name = "arvind12345";
        String number = "";
        int sum = 0;
        for (int i = 0; i < name.length(); i++)
        {
            char ch=name.charAt(i);
            if (Character.isDigit(name.charAt(i)))
            {
                number = number+ch;
            }
        }
        System.out.println("Number seperated from string is :-" +number);
           char[] value=number.toCharArray();
           for(int j=value.length-1;j>=0;j--)
           {
               sum=sum+value[j]%10;
           }
        System.out.println("The sum of value is :-" +sum);
    }
}