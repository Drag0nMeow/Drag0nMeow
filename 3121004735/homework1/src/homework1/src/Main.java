import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception,IOException{
        if(args.length!=3){
            System.out.println("参数输入有误！");//参数数量错误提示
            return;
        }
        String filePathOrig = args[0];//原文文档路径为第一个参数
        String filePathCopy = args[1];//抄袭文档路径为第二个参数
        String filePathResult = args[2];//生成结果文档路径为第三个参数
        String content1 = new FileEditor().readFile(filePathOrig);//获取原文文档内容
        String content2 = new FileEditor().readFile(filePathCopy);//获取抄袭文档内容
        float repetition = new Calculator().calculateSimilarity(content1,content2);//计算相似度
        new FileEditor().writeFile(filePathResult,"文本相似度为:" +String.format("%.2f", repetition)+"%");//将结果写入答案文档
        System.out.println("文本相似度为:"+String.format("%.2f", repetition)+"%");
        System.out.println("结果已生成至:"+filePathResult);
    }
}