package com.test;


/**
 * �ƽ�ָ��
 * 	Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���
 * 	��ĸ�ͷ��Ӳ���ͬʱΪż��
 * 	��ĸ�ͷ��� ȡֵ��Χ��[1-20]
 * @author Administrator
 *
 */
public class Test01 {
	
	private final static float goldenMean = 0.618f;
	private static float minDiff = 100f;

	public static void main(String[] args) {
		int answerFenzi = 0;
		int answerFenmu = 0;		
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				if(0 == i%2 && 0 == j%2){
					continue;
				}else{
					float value = (float)i/j;
					//System.out.println(value);
					float diff = Math.abs(value - goldenMean);
					if(diff < minDiff){
						minDiff = diff;
						answerFenzi = i;
						answerFenmu = j;
					}
				}
				
			}
			
		}
		
		System.out.println("����Ϊ��" + answerFenzi + "��ĸΪ��" + answerFenmu + "�����Ϊ��" + answerFenzi + "/" + answerFenmu + "=" + ((float)answerFenzi/answerFenmu));
		System.out.println("�ƽ�ָ��=" + goldenMean);
	}
	
	
}
