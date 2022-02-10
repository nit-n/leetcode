package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 1447. 最简分数
给你一个整数 n ，请你返回所有 0 到 1 之间（不包括 0 和 1）满足分母小于等于  n 的 最简 分数 。分数可以以 任意 顺序返回。
0<=n<=100
 * */
public class Num_1447 {
	public static void main(String[] args) {
		List<String>str=solution(11); 
	}
	/*  解题思路：根据传入的整数n知获取分母a的定义域0<a<=n-1
	 *  分子b的定义域为0<b<a-1
	 *  求出a的因数后将a-1>0范围内的整数排除因数后即为最简分数分子b1的 (求因数并不能求出所有能约分的数)
	 *  根据公因数来判断是否满足最简分数。
	 */
	public static List solution(int n){
		List<String> str=new ArrayList();
		String strNum="";
		for(int i=2;i<=n;i++) {
			for(int j=1;j<i;j++) { 
				 if(test(i,j)==1) {
				 strNum=j+"/"+i;
				 str.add(strNum);
				 } 			
			}
		}
		return str;
	}
	//获取公因数
	public static int test(int a,int b) {
		int temp;
		while(b!=0) {
			temp=a%b;
			a=b;
			b=temp;
		}
		return a;
	}
}
