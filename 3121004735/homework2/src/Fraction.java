import java.util.Random;

public class Fraction {
    int numberator;//分子
    int denominator;//分母
    public Fraction(){
        numberator = 0;
        denominator = 1;
    }
    public Fraction(int numberator,int denominator){
        if(denominator == 0){
            System.out.println("分母为0,分数创建失败");
            return;
        }
        this.numberator = numberator;
        this.denominator = denominator;
    }
    public Fraction random(int n){//随机生成一个分数,分子分母均不大于n
        Fraction f1 = new Fraction(new Random().nextInt(n)+1,new Random().nextInt(n)+1);
        return f1;
    }
    public Fraction add(Fraction f1,Fraction f2){//分数加法
        Fraction f = new Fraction();
        f.numberator = f1.numberator*f2.denominator+f2.numberator*f1.denominator;
        f.denominator = f1.denominator*f2.denominator;
        return f;
    }
    public Fraction sub(Fraction f1,Fraction f2){//分数减法
        Fraction f = new Fraction();
        f.numberator = f1.numberator*f2.denominator-f2.numberator*f1.denominator;
        f.denominator = f1.denominator*f2.denominator;
        return f;
    }
    public Fraction mul(Fraction f1,Fraction f2){//分数乘法
        Fraction f = new Fraction();
        f.numberator = f1.numberator*f2.numberator;
        f.denominator = f1.denominator*f2.denominator;
        return f;
    }
    public Fraction div(Fraction f1,Fraction f2){//分数除法
        Fraction f = new Fraction();
        f.numberator = f1.numberator*f2.denominator;
        f.denominator = f1.denominator*f2.numberator;
        return f;
    }
    public String toString(){
        //约分
        int a,b,c;
        a=numberator;
        b=denominator;
        while(b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        if(a != 0){
            numberator = numberator/a;
            denominator = denominator/a;
        }
        //分子被分母整除以整数形式输出
        if(numberator/denominator>0&&numberator%denominator==0)
            return numberator/denominator+"";
        //大于1的分数以"整数'真分数"形式输出
        else if(numberator>denominator)
            return numberator/denominator+"'"+numberator%denominator+"/"+denominator;
        //小于1的分数正常输出
        else
            return numberator+"/"+denominator;
    }
}
