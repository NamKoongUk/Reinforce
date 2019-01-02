package com.one.day;


import java.util.Random;
import java.util.Scanner;

public class F_reinForce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("강화 하시겠습니까 ? (강화확률 %.2f퍼센트 입니다.) [y/n] : ", 0.5*100);
		char ch = sc.next().charAt(0);
		double random = new Random().nextInt(2);
		double random1 = new Random().nextInt(2);


		if(ch == 'y' || ch == 'Y') {
			if(random == 1 ) {
				System.out.printf("+1 강화에 성공하셨습니다. \n +2 강화(강화확률 %.2f퍼센트 입니다.)를 계속 하시겠습니까? [y/n] :   " ,  (0.5*0.5)*100);
				char ch1 = sc.next().charAt(0);
				if((ch1 == 'y' || ch1 == 'Y') && random*random1 == 1 ) {
					System.out.println("+2 강화에 성공하셨습니다. 더 이상 강화할 수 없습니다.");

				}else if(random*random1 == 0) {
					System.out.println("강화 실패 무기가 파괴되었습니다 새로운 무기를 준비해주세요");
				}
			}else if(random == 0) {
				System.out.println("강화 실패 무기가 파괴되었습니다 새로운 무기를 준비해주세요");
			}	


		} else if(ch == 'n' || ch == 'N') {
			System.out.println("강화 시스템 종료");

		}else {	
			System.out.println("입력 오류 다시 입력해주세요  ");
			new F_reinForce().main(null);
		}
	}

}
