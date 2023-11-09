import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("身長(cm)を入力してください。");
        double height = sc.nextDouble();
        System.out.println("体重(kg)を入力してください。");
        double weight = sc.nextDouble();

        double height2 = ((height / 100.00) * (height / 100.00));
        double bmi = weight / height2;
        System.out.println("あなたのBMIは" + String.format("%.2f",bmi) + "です。");

        if(bmi < 18.50){
            System.out.println("あなたは瘦せ型です。");
        } else if(bmi < 25.00){
            System.out.println("あなたは普通体重です。");
        } else {
            System.out.println("あなたは肥満です。気をつけてください。");
        }

        System.out.println("あなたの身長の適正体重は" + String.format("%.2f",height2 * 22) + "kgです。");
    }
}
