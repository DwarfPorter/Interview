package ru.geekbrain;

// Вычисление факториала при помощи дерева
// Факториал это вычисление произведения последовательных чисел.
// Можно перемножать числа не последовательно друг за другом, а постоянно делить интервал на две части
// и перемножать соседние элементы.
class FactorialTree {
    private long arg;

    FactorialTree(long arg) {
        this.arg = arg;
    }

    private long BiTree(long a, long b) {
        if (a == b) return b;
        if (b - a == 1) return a * b;
        int m = (int) ((a + b) / 2);
        return BiTree(a, m) * BiTree(m+1 , b);
    }

    public long Do() {
        if (arg == 0 || arg == 1) return 1;
        if (arg == 2) return 2;
        return BiTree(2, arg);
    }

    // Многопоточное вычисление факториала
    public long DoAsync(){
        if (arg == 0 || arg == 1) return 1;
        if (arg == 2) return 2;
        BiTreeAsync t1 = new BiTreeAsync(2, arg);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        return t1.getResult();
    }

    class BiTreeAsync extends Thread{
        private long result;
        private long a;
        private long b;

        BiTreeAsync(long a, long b){
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            if (a == b) {
                result = b;
                return;
            }
            if (b - a == 1) {
                result = a*b;
                return;
            }
            int m = (int) ((a + b) / 2);
            BiTreeAsync t1 = new BiTreeAsync(a, m);
            BiTreeAsync t2 = new BiTreeAsync(m+1, b);
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {

            }
            result = t1.getResult() * t2.getResult();
        }

        public long getResult(){
            return result;
        }
    }

}

