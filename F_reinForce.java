package com.one.day;


import java.util.Random;
import java.util.Scanner;

public class F_reinForce {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("��ȭ �Ͻðڽ��ϱ� ? (��ȭȮ�� %.2f�ۼ�Ʈ �Դϴ�.) [y/n] : ", 0.5*100);
		char ch = sc.next().charAt(0);
		double random = new Random().nextInt(2);
		double random1 = new Random().nextInt(2);


		if(ch == 'y' || ch == 'Y') {
			if(random == 1 ) {
				System.out.printf("+1 ��ȭ�� �����ϼ̽��ϴ�. \n +2 ��ȭ(��ȭȮ�� %.2f�ۼ�Ʈ �Դϴ�.)�� ��� �Ͻðڽ��ϱ�? [y/n] :   " ,  (0.5*0.5)*100);
				char ch1 = sc.next().charAt(0);
				if((ch1 == 'y' || ch1 == 'Y') && random*random1 == 1 ) {
					System.out.println("+2 ��ȭ�� �����ϼ̽��ϴ�. �� �̻� ��ȭ�� �� �����ϴ�.");

				}else if(random*random1 == 0) {
					System.out.println("��ȭ ���� ���Ⱑ �ı��Ǿ����ϴ� ���ο� ���⸦ �غ����ּ���");
				}
			}else if(random == 0) {
				System.out.println("��ȭ ���� ���Ⱑ �ı��Ǿ����ϴ� ���ο� ���⸦ �غ����ּ���");
			}	


		} else if(ch == 'n' || ch == 'N') {
			System.out.println("��ȭ �ý��� ����");

		}else {	
			System.out.println("�Է� ���� �ٽ� �Է����ּ���  ");
			new F_reinForce().main(null);
		}
	}

}
