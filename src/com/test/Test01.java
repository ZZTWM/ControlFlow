package com.test;


/**
 * 黄金分割点
 * 	寻找某两个数相除，其结果 离黄金分割点 0.618最近
 * 	分母和分子不能同时为偶数
 * 	分母和分子 取值范围在[1-20]
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
		
		System.out.println("分子为：" + answerFenzi + "分母为：" + answerFenmu + "，相除为：" + answerFenzi + "/" + answerFenmu + "=" + ((float)answerFenzi/answerFenmu));
		System.out.println("黄金分割点=" + goldenMean);
	}
	
	
}
