package leetcode;

import java.util.ArrayList;
/*
 *题目：
泰波那契序列 Tn 定义如下： 

T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2

给你整数 n，请返回第 n 个泰波那契数 Tn 的值。

 
 */
public class tribonacci {
    //tn+3=tn+tn+1+tn+2
    /**t4+3=t4+t5+t6
    t3=t0+t1+t2
    t1+3=t1+t2+t0+t1+t2
    t2+3=t2+t3+t4=t2+t0+t1+t2+t1+t2+t0+t1+t2
    t3+3=t3+t4+t5=t2+t0+t1+t2+t1+t2+t0+t1+t2+ t0+t1+t2 + t1+t2+t0+t1+t2
    t22+3=t22+t23+t24
    tn=tn-3+tn-2+tn-1
     */
	//根据题目可知从T3开始，有Tn=Tn-3+Tn-2+Tn-1
	//通过集合来存储对应的n和Tn，当存储到Tn时即可返回结果。
    public int tribonacci(int n) {
        ArrayList < Integer > T=new ArrayList < Integer > ();
        T.add(0, 0);
        T.add(1, 1);
        T.add(2, 1);
        int sum=0;
        if(n<3){
            return T.get(n);
        }else {
        	for(int j=3;j<=n;j++) {       		
        		//sum=sum+;
        		T.add(j, T.get(j-3)+T.get(j-2)+T.get(j-1));
        	}
        }
        return T.get(n);
        /**动态规划法：
         * public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int p = 0, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; ++i) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }
    		作者：LeetCode-Solution
		链接：https://leetcode-cn.com/problems/n-th-tribonacci-number/solution/di-n-ge-tai-bo-na-qi-shu-by-leetcode-sol-kn16/
		来源：力扣（LeetCode）
         */
        
        /**	矩阵快速幂
         *    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int[][] q = {{1, 1, 1}, {1, 0, 0}, {0, 1, 0}};
        int[][] res = pow(q, n);
        return res[0][2];
    }

    public int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(ret, a);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    public int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }
        return c;
    }
		作者：LeetCode-Solution
		链接：https://leetcode-cn.com/problems/n-th-tribonacci-number/solution/di-n-ge-tai-bo-na-qi-shu-by-leetcode-sol-kn16/
		来源：力扣（LeetCode）
         */
    }
}
