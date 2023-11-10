# BMI計算アプリの使い方

## 1.身長と体重を入力しましょう
それぞれのユーザーの身長(cm)と体重(kg)を入力します。  
入力したら「Enterキー」を押すと次の項目に進むことができます。  
※身長はcm、体重はkgになっているので気をつけてください。
![身長と体重の入力](/img/入力.png)
## 2.BMIを確認しよう
入力が終わったらBMIが表示され肥満かどうかの判定が行われます。  
また、あなたの身長に対する適正体重も計算してくれます。
![計算結果](/img/計算結果.png)

## 3.注意事項
このアプリは開発途中なのでいろいろと足りない機能があることをご承知おきください。以下に注意事項を記載します。

1.数字以外を入力しないでください。  
数字以外が入力されたときに警告文を出しながら処理を巻き戻す機能が実装されていません。誤った内容を入力すると強制終了してしまいます。注意してください。

2.BMIの数値による肥満判定には実際はもっと段階があります。段階分けして判定する機能が実装されるまでもうしばらくお待ちください。

## 4.最後に
ここまで読んでいただきありがとうございました。  
このアプリを活用していただけるととても嬉しく思います。  
今後も機能を追加してブラッシュアップしていきますので何卒よろしくお願い申し上げます。

---  
### コードの内容について
簡単にコードについて説明を書いておきます。

```
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
double heightA = sc.nextDouble();
```
標準入力で身長体重を受け取ります。  
importを忘れずに。

```
System.out.println("ユーザーAのBMIは" + String.format("%.2f",bmiA) + "です。");
```

この部分でString.formatを使っています。  
これは少数第何位まで表示するかを変更することができます。  
