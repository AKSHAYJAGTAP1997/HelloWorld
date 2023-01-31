import java.util.Scanner;

 class Certificate {

 static Scanner sc=new scanner(System.in);
 static String subject[]={"ENGLISH","MARATHI","HINDI","MATHAMATICS","SOCIAL SCIENCE"};
 static int outof=100;
 private int marks[]=new int[subject.length];
 private double percent;
 
 

public static void main(String[] args)

{

int english, marathi, hindi, science, maths;

float total, Percentage, Average;

sc = new Scanner(System.in);

System.out.print(" Please Enter the Five Subjects Marks : ");

english = sc.nextInt();

marathi = sc.nextInt();

hindi = sc.nextInt();

science = sc.nextInt();

maths = sc.nextInt();

total = english + marathi + hindi + science + maths;

Average = total / 5;

Percentage = (total / 500) * 100;


System.out.println("marathi                     "+marathi);

System.out.println(" Total Marks = " + total);

System.out.println(" Average Marks = " + Average);

System.out.println(" Marks Percentage = " + Percentage);


int min = 100;  
int max = 400;  
   
 
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println("Barcode is"+b);

}

}

