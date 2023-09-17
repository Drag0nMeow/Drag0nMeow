import java.io.*;

public class FileEditor {
    public static String readFile(String filePath) {
        //文件读取
        String content = "";
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                content = content + br.readLine() + "\n";
            }

        }
        catch(IOException e){
            System.out.println("读取文件失败！");
        }
        return content;
    }

    public static void writeFile(String filePath, String text) {
        //文件写入
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(text);
            writer.close();
        }
        catch(IOException e){
            System.out.println("写入文件失败！");
        }
    }
}
