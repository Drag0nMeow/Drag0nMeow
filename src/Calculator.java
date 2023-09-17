public class Calculator {
    public float calculateSimilarity(String origtext,String copytext) {
        //编辑距离计算文本相似度
        float similarity = 0;
        int d[][]; // 矩阵
        int n = origtext.length();
        int m = copytext.length();
        int i; // 遍历origtext
        int j; // 遍历copytext
        char ch1; // origtext的
        char ch2; // copytext的
        int temp; // 记录相同字符,在某个矩阵位置值的增量,不是0就是1
        if (n == 0 || m == 0) {
            return 0;
        }
        d = new int[n + 1][m + 1];
        for (i = 0; i <= n; i++) { // 初始化第一列
            d[i][0] = i;
        }

        for (j = 0; j <= m; j++) { // 初始化第一行
            d[0][j] = j;
        }

        for (i = 1; i <= n; i++) { // 遍历origtext
            ch1 = origtext.charAt(i - 1);
            // 去匹配target
            for (j = 1; j <= m; j++) {
                ch2 = copytext.charAt(j - 1);
                if (ch1 == ch2 || ch1 == ch2 + 32 || ch1 + 32 == ch2) {
                    temp = 0;
                } else {
                    temp = 1;
                }
                // 左边+1,上边+1, 左上角+temp取最小
                d[i][j] = Math.min(Math.min(d[i - 1][j] + 1, d[i][j - 1] + 1), d[i - 1][j - 1] + temp);
            }
        }
        similarity = (1 - (float) d[n][m] / Math.max(origtext.length(), copytext.length())) * 100F;
        return similarity;
    }
}
