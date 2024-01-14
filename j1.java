import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int b=0;
        int c=(int)(Math.random()*100);
        while(b!=c){
            System.out.println("enter a number : \n");
            Scanner m= new Scanner(System.in);
            int d=m.nextInt();
            if(d>c){
                System.out.println("number is smaller\n");
            }
            else{
                System.out.println("number is larger");
            }
            b=d;
        }
        System.out.println("correct\n");
    }
}