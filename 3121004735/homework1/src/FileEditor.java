import java.io.*;

public class FileEditor {
    public static String readFile(String filePath) throws IOException {
        //文件读取
        String content = "";
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()){
          content = content + br.readLine()+"\n";
        }
        return content;
    }
    public static void writeFile(String filePath, String text) throws IOException{
        //文件写入
        FileWriter writer = new FileWriter(filePath);
        writer.write(text);
        writer.close();
    }
}
