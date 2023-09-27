import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    void FractionTest1(){//生成一个分数
        //生成一个分数，参数为2,3,结果应为2/3
        Fraction f1 = new Fraction(2,3);
        assertEquals("2/3",f1.toString());
        //生成一个分数，参数为3,2,结果应为1'1/2
        Fraction f2 = new Fraction(3,2);
        assertEquals("1'1/2",f2.toString());
        //生成一个分数，数值为2,4,结果应为1/2
        Fraction f3 = new Fraction(2,4);
        assertEquals("1/2",f3.toString());
        //生成一个分数，数值为4,2,结果应为2
        Fraction f4 = new Fraction(8,4);
        assertEquals("2",f4.toString());
    }
    @Test
    void FractionTest2(){//生成一个分数,分母为0时报错
        Fraction f1 = new Fraction(2,0);
    }
    @Test
    void FractionTest3(){//随机生成三个分数
        Fraction f1 = new Fraction().random(10);
        Fraction f2 = new Fraction().random(10);
        Fraction f3 = new Fraction().random(10);
        System.out.println("numberator = "+f1.numberator+" denominator = "+f1.denominator +" f1 = " + f1.toString());
        System.out.println("numberator = "+f2.numberator+" denominator = "+f2.denominator +" f2 = " + f2.toString());
        System.out.println("numberator = "+f3.numberator+" denominator = "+f3.denominator +" f3 = " + f3.toString());
    }
    @Test
    void FractionTest4(){//分数加法
        // 3/2+2/3 = 13/6 = 2'1/6
        Fraction f1 = new Fraction(3,2);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction().add(f1,f2);
        assertEquals("2'1/6",f3.toString());
    }
    @Test
    void FractionTest5(){//分数减法
        // 3/2-2/3 = 5/6
        Fraction f1 = new Fraction(3,2);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction().sub(f1,f2);
        assertEquals("5/6",f3.toString());
    }
    @Test
    void FractionTest6(){//分数乘法
        // 3/2*2/3 = 1,
        Fraction f1 = new Fraction(3,2);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction().mul(f1,f2);
        assertEquals("1",f3.toString());
        // 3/2*3/2 = 9/4 = 2'1/4
        Fraction f4 = new Fraction(3,2);
        Fraction f5 = new Fraction(3,2);
        Fraction f6 = new Fraction().mul(f4,f5);
        assertEquals("2'1/4",f6.toString());
    }
    @Test
    void FractionTest7(){//分数除法
        // 3/2÷2/3 = 9/4 = 2'1/4,
        Fraction f1 = new Fraction(3,2);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = new Fraction().div(f1,f2);
        assertEquals("2'1/4",f3.toString());
        // 3/2÷3/2 = 1
        Fraction f4 = new Fraction(3,2);
        Fraction f5 = new Fraction(3,2);
        Fraction f6 = new Fraction().div(f4,f5);
        assertEquals("1",f6.toString());
    }
}