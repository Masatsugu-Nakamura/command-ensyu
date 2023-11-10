import java.util.Scanner;

public class Bmi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1人目(ユーザーA)の身長(cm)を入力してください。");
        double heightA = sc.nextDouble();
        System.out.println("1人目(ユーザーA)の体重(kg)を入力してください。");
        double weightA = sc.nextDouble();

        System.out.println("2人目(ユーザーB)身長(cm)を入力してください。");
        double heightB = sc.nextDouble();
        System.out.println("2人目(ユーザーB)体重(kg)を入力してください。");
        double weightB = sc.nextDouble();

        double height1 = ((heightA / 100.00) * (heightA / 100.00));
        double height2 = ((heightB / 100.00) * (heightB / 100.00));
        double bmiA = weightA / height1;
        double bmiB = weightB / height2;

        System.out.println("ユーザーAのBMIは" + String.format("%.2f",bmiA) + "です。");


        if(bmiA < 18.50){
            System.out.println("ユーザーAは瘦せ型です。");
        } else if(bmiA < 25.00){
            System.out.println("ユーザーAは普通体重です。");
        } else {
            System.out.println("ユーザーAは肥満です。気をつけてください。");
        }

        System.out.println("ユーザーAの身長の適正体重は" + String.format("%.2f",height1 * 22) + "kgです。");


        System.out.println("ユーザーBのBMIは" + String.format("%.2f",bmiB) + "です。");
        
        if(bmiB < 18.50){
            System.out.println("ユーザーBは瘦せ型です。");
        } else if(bmiB < 25.00){
            System.out.println("ユーザーBは普通体重です。");
        } else {
            System.out.println("ユーザーBは肥満です。気をつけてください。");
        }

        System.out.println("ユーザーBの身長の適正体重は" + String.format("%.2f",height2 * 22) + "kgです。");
    }
}
