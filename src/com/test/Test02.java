package com.test;

/**
 * ˮ�ɻ���
 * ˮ�ɻ������壺
 * 	1. һ����3λ��
 * 	2. ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3
 * 	Ѱ�����е�ˮ�ɻ���
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		
		for (int i = 100; i < 1000; i++) {
			int baiwei = i/100;
			int shiwei = i/10%10;
			int gewei = i%10;
			int cubeNumber = cube(baiwei) + cube(shiwei) + cube(gewei);
			if (cubeNumber == i){
				System.out.println("�ҵ�ˮ�ɻ�����" + i);
			}
		}
		
	}
	
	private static int cube(int temp){
		return temp * temp * temp;
	}
}
