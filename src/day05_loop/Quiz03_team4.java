package day05_loop;

import java.util.Scanner;

public class Quiz03_team4 {
	public static void main(String[] args) {
		//문제 1번
		/*
		int num=0;
		for(num=65; num<=90; num++) {
			System.out.print((char)num+"\t");
		}
		*/
		//문제 2번
		/*
		int num=0,sum=0;
		for(num=1; num<=20; num++) {
			if(num%2!=0||num%3!=0) {
				sum+=num;
			}
		}System.out.println(sum);
		*/
		//문제 3번
		/*
		int i=0, j=0;
		for(i=1; i<=6; i++) {
			for(j=1; j<=6; j++) {
				if(i+j==6)
				System.out.println("i="+i+" "+"j="+j);
			}
		}
		*/
		//문제 4번
		/*
		Scanner input = new Scanner(System.in);
		for(int i=0;;) {
			System.out.print("수 입력:");
			i=input.nextInt();
			System.out.println("내가 입력한 수는:"+i);
			if(i==9) 
				break;
		}System.out.println("9가 입력되어 프로그램을 종료합니다.");
		*/
		//문제 5번
		/*
		int star1=0,star2=0;
		for(star1=1; star1<=7; star1++) {
			for(star2=1; star2<=7; star2++) {
				System.out.print("★");
			}
			System.out.println();
		}
		*/
		
		
			
	}
}
