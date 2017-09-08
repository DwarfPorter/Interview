package ru.geekbrain;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(FactorialRecusion(a));
        int b = 10;
        System.out.println(FactorialLoop(b));
        int c = 10;
        System.out.println((new FactorialTree(c)).Do());
        int d = 10;
        System.out.println((new FactorialTree(d)).DoAsync());

    }

    // Самый простой способ, но и самый ресурсоемкий, засчет рекурсии
    // при рекурсии сильно растет стек, а рост стека может вызвать переполнение
    // И хотя врядли факториал вызовет переполнение стека, но все таки это дорогостоящая операция
    public static long FactorialRecusion(long a){
        if (a==0) return 1;
        return FactorialRecusion(a-1)*a;
    }

    // Вычисление факториала циклом
    public static long FactorialLoop(long a){
        if (a == 0 || a == 1) return 1;
        long f=1;
        long t = 1;
        while (t < a){
            t++;
            f *= t;
        }
        return f;
    }
}
