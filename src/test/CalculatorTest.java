import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void calculateSimilarityTest1(){
        //相同文本计算相似度，预计为100%
        float similarity = new Calculator().calculateSimilarity("今天天气真好","今天天气真好");
        assertEquals(100,similarity);
    }
    @Test
    void calculateSimilarityTest2(){
        //空文本计算相似度,预计为0
        float similarity = new Calculator().calculateSimilarity("","");
        assertEquals(0,similarity);
    }
    @Test
    void calculateSimilarityTest3(){
        //类似文本计算相似度,预计为66%
        float similarity = new Calculator().calculateSimilarity("今天天气真好","今天天气不行");
        assertEquals(66,(int)similarity);
    }
}