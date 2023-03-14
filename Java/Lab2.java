
public class Lab2 {
    static class src{
        //2.1
        static void probComp(double num){
            double count = 0;
            for(int i = 0; i < num; i++){
                if(Math.random()>0.5){
                    count = count + 1;
                }
            }
            double prob = count/num;
            //System.out.println(prob);
            System.out.println("The frequence under" + num +"tries, the frequence rate for x > 0.5 is:" + prob);
        }
        //2.2
        static int factorial(int num){
            int factorial = num;
            while((num-1)!=0){
                factorial = factorial*(num-1);
                num = num - 1;  
            }
            return factorial;
        }
        //2.3
        static class Diedemo{
            public int roll(){
                double num = 6*Math.random();
                int x = 0;
                if (num <= 1){
                    x = 1;
                }
                else if (num > 1 && num <=2){
                    x = 2;
                }
                else if (num > 2 && num <=3){
                    x = 3;
                }
                else if (num > 3 && num <=4){
                    x = 4;
                }
                else if (num > 4 && num <=5){
                    x = 5;
                } 
                else if (num > 5 && num <=6){
                    x = 6;
                }
                return x;              
            }
        }
        //2.4
        static void countdown(int n){
            System.out.println(n);
            if(n == 0){
                System.out.println("Blast off!");
            }
            else{
                n = n - 1;
                countdown(n);
            }
        }
        //2.5
        static class USMoney{
            int dollar = 0;
            int cents = 0;

            public USMoney(int d, int c){
                if(c >= 100){
                    d = d + c/100;
                    c = c % 100;
                }
                this.dollar = d;
                this.cents = c;
            }

            public static src.USMoney plus(src.USMoney A, src.USMoney B){
                int d = A.dollar + B.dollar;
                int c = A.cents + B.cents;
                src.USMoney sum = new USMoney(d,c);
                return sum;
            }
        }
        //2.6
        public static void budget(double budget,double keyboard[],double USB[]){
            double plist[] = new double[9];
            double p = 0;
            int index = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    p = keyboard[i] + USB[j];
                    if(p > budget){
                        p = -1;
                    }
                    plist[index] = p;
                    index = index + 1;
                }
            }

            for(int i = 1; i < 9; i++){
                if(plist[0] < plist[i]){
                    double temp = 0;
                    temp = plist[0];
                    plist[0] = plist[i];
                    plist[i] = temp;
                }
            }
            System.out.println("The ouput will be " + plist[0]);
        }
    }  
    public static void main(String[] args){
        //2.1
        src.probComp(10);
        src.probComp(100);
        src.probComp(1000);

        //2.2
        System.out.println("The factorial of 8 is " + src.factorial(8));

        //2.3
        src.Diedemo DieA = new src.Diedemo();
        src.Diedemo DieB = new src.Diedemo();
        int sum = 0;
        int result [] = new int[11]; //there are 11 possible sum value range from 2~12
        for(int i = 0; i < 1000; i++){
            sum = DieA.roll() + DieB.roll();
            result[sum-2] = result[sum-2] + 1;
        }
        for(int i = 0; i < 11; i++){
            System.out.println("Value:"+ (i+2) + " show up for " + result[i] + " times");
        }

        //2.4
        long startA = System.currentTimeMillis();
        //System.out.println("The start time of recursive method is"+ startA);
        src.countdown(1000);
        long endA = System.currentTimeMillis();
        //System.out.println("The end time of recursive method is"+ endA);
        long exeTa = endA - startA;
        //System.out.println("Time for recursive method" + exeTa);
        long startB = System.currentTimeMillis();
        //System.out.println("The start time of iteration method is"+ startB);
        for(int i = 0; i < 1001; i++){
            System.out.println(1000-i);
            if(i == 1000){
                System.out.println("Blast off!");
            }
        }
        long endB = System.currentTimeMillis();
        //System.out.println("The end time of iteration method is"+ endB);
        long exeTb = endB - startB;
        //System.out.println("Time for iterataion method" + exeTb);
        System.out.println("The execution time of iteration method save " + (exeTa-exeTb) + " millisecond for 1000 iterations");

        //2.5
        src.USMoney m1 = new src.USMoney(12, 110);
        src.USMoney m2 = new src.USMoney(1, 201);
        src.USMoney add = src.USMoney.plus(m1, m2);
        System.out.println("The sum is " + add.dollar + " dollar and" + add.cents + " cents");

        //2.6
        double budget = 80;
        double keyboard [] ={23.4,56,100};
        double USB [] = {5,45,61};
        src.budget(budget, keyboard, USB);
    }
}
