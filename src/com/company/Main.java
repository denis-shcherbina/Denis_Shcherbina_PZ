package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //////ЛР_1////////
        System.out.println("Hello world!");
        System.out.println("This task done by Denis Shcherbina PZ-18-1/9");

        //////ЛР_2////////
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

        //////ЛР_3////////
        long l = 123456L;
        float f = 14.75F;
        char c1 = '0';

        l = (long)f;
        Random random = new Random();
        double d1 = 100.0D + random.nextDouble() * 900.0D;
        double d2 = 1.0D + random.nextDouble() * 98.0D;
        System.out.println("l= " + l);
        System.out.println("d1= " + d1);
        System.out.println("d2= " + d2);
        System.out.println("f= " + f);
        System.out.println("c1= " + c1);

        double y=(Math.sqrt(d1)-1/3*Math.sqrt(d2))/((l-d1)*(Math.pow(l,2)+d2));
        System.out.println("y= " + y);

        //////ЛР_4////////
        String s="Hello world";
        System.out.println(s.charAt(3));

        for (int codePoint = 0x1F600, j =0; j < 3; j++) {
            System.out.println(Character.toChars(codePoint));
            codePoint++;
            if (codePoint % 16 == 0) {
                System.out.println();
            }
        }

        String sentence = "Навіщо ми тут?";
        System.out.println(sentence);
        char lastCharacter = sentence.charAt(sentence.length() - 1);
        if(lastCharacter == '!') {
            System.out.println("Це речення є окличним");
        }
        else if(lastCharacter == '?') {
            System.out.println("Це речення є питальним");
        }
        else {
            System.out.println("Це речення не окличне і не питальне");
        }

        //////ЛР_5////////
        int x=(int)(Math.random()*3);
        switch (x)
        {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("default case");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scanner.nextInt();
        System.out.println("x= " + a);
        if(a<0)
        {
            double y=3*Math.pow(a,3)-12*a+4;
            System.out.println("y= " + y);
        }
        else if(a==0)
        {
            double y= ((Math.pow(a,4)-11)*(Math.pow(a,4)+11))/(Math.sqrt(a));
            System.out.println("y= " + y);
        }
        else
        {
            System.out.println("Значення більше 0");
        }

        System.out.println("Введіть годину");
        int h = scanner.nextInt();
        System.out.println("Введіть хвилину");
        int m = scanner.nextInt();
        System.out.println("Час: "+h+":"+m);
        if(h<12)
        {
            System.out.println("Добрий ранок");
        }
        else if(h>12 && h<17)
        {
            System.out.println("Добрий день");
        }
        else if(h>17 && h<22)
        {
            System.out.println("Добрий вечір");
        }
        else
        {
            System.out.println("Добраніч");
        }

        //////ЛР_6////////
        StringBuffer s =new StringBuffer("hello");
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)!='e')&&(s.charAt(i)!='o')){
                continue;
            }
            s.setCharAt(i,'_');
        }
        System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        for (double i=-5;i<5;i+=0.5){
            if(x!=0) {
                System.out.println("y= " + (x - 5) * (x + 5) / x);
            }
            else{
                System.out.println("Значення не може бути вироховано, оскілки х=0");
            }
        }

        Scanner scanner = new Scanner(System.in);
        int a, prod =1;
        for(int i=0; i<10; i++){
            a=scanner.nextInt();
            if(a!=0){
                prod*=a;
            }
            else{
                i--;
                System.out.println("Неможна вводити число 0");
                continue;
            }
        }
        System.out.println("Добуток чисел: "+prod);

        int counter =0;
        String str;
        while(true) {
            str=scanner.nextLine();
            if(Objects.equals(str, "done")){
                break;
            }
            else{
                if(str.length()>10){
                    counter++;
                }
            }
        }
        System.out.println("кількість рядків, довжина яких більше 10 символів: "+counter);

        //////ЛР_7////////
        int[][] array1 = new int[3][3];
        for (int i=0; i<array1.length; i++)
            for (int j=0; j<array1[i].length; j++)
                array1[i][j] = (int)(Math.random()*100);
        for (int i=0; i<array1.length; i++)
            System.out.println(Arrays.toString(array1[i]));
        int[] result = new int[array1.length];
        for (int i=0; i<result.length; i++)
            for (int j=0; j<result.length; j++)
                result[i] += array1[i][j];
        System.out.println(Arrays.toString(result));

        System.out.println("Введіть розмірність масиву");
        Scanner scanner=new Scanner(System.in);
        int smallest=0;
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 50) - 20);
            System.out.println(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                smallest=array[i];
                break;
            }
        }
        for(int i=0;i<array.length;i++){
            if(smallest>array[i]&&array[i]>0){
                smallest=array[i];
            }
        }
        System.out.println("Найменше додатнє число = "+smallest);
        int negNum = 0;
        boolean foundNeg = false;
        for(int i=0; i<array.length; i++) {
            if(array[i] < negNum && !foundNeg){
                foundNeg = true;
                negNum = array[i];
            }
            else if(foundNeg && array[i] < 0 && negNum < array[i]) {
                negNum = array[i];
            }
        }
        System.out.println("Найбільше відємне число = "+negNum);

        System.out.println("Введіть координати");
        Scanner scanner1 = new Scanner(System.in);
        double b1 = scanner1.nextDouble();
        double []x = new double[(int) b1];
        double []y = new double[(int) b1];
        for (int i = 0; i < b1; i++) {
            x[i] = Math.round(Math.random()*b1);
            y[i] = Math.round(Math.random()*b1);
            System.out.println("X"+(i+1)+" = "+x[i]+" Y"+(i+1)+" = "+y[i]);
        }
        double []result1 = new double[(int) b1];
        double x0 = 0 , y0 = 0 ;
        for (int i = 0; i < b1; i++) {
            result1[i] = Math.sqrt((Math.pow(x[i]-x0, 2)+Math.pow(y[i]-y0, 2)));
            System.out.println((i+1)+"distance = "+result1[i]);
        }
    }
}



