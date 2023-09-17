import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception,IOException{
        if(args.length!=3){
            System.out.println("参数输入有误！");
            return;
        }
        String filePathOrig = args[0];
        String filePathCopy = args[1];
        String filePathResult = args[2];
        String content1 = new FileEditor().readFile(filePathOrig);
        String content2 = new FileEditor().readFile(filePathCopy);
        float repetition = new Calculator().calculateSimilarity(content1,content2);
        new FileEditor().writeFile(filePathResult,"文本相似度为:" +String.format("%.2f", repetition)+"%");
        System.out.println("文本相似度为:"+String.format("%.2f", repetition)+"%");
        System.out.println("结果已生成至:"+filePathResult);
    }
}