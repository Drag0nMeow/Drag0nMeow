import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileEditorTest {

    @Test
    void readFileTest() throws IOException {
        //测试文件读取
        String content = new FileEditor().readFile("C:\\Users\\huangjiabao\\Desktop\\test\\test1.txt");
        assertEquals("读文件测试\n",content);
    }


    @Test
    void writeFileTest() throws IOException{
        //测试文件写入
        new FileEditor().writeFile("C:\\Users\\huangjiabao\\Desktop\\test\\test2.txt","写文件测试");
        String content = new FileEditor().readFile("C:\\Users\\huangjiabao\\Desktop\\test\\test2.txt");
        assertEquals("写文件测试\n",content);
    }
}