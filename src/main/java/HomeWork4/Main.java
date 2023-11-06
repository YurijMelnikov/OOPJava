package HomeWork4;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<GoldenApple> goldenAppleBox1 = new Box<>();
        Box<GoldenApple> goldenAppleBox2 = new Box<>();
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            orangeBox1.add(new Orange(rnd.nextInt(2, 7)));
            orangeBox2.add(new Orange(rnd.nextInt(2, 7)));
            appleBox1.add(new Apple(rnd.nextInt(1, 5)));
            appleBox2.add(new Apple(rnd.nextInt(1, 5)));
            goldenAppleBox1.add(new GoldenApple(rnd.nextInt(5, 13)));
            goldenAppleBox2.add(new GoldenApple(rnd.nextInt(5, 13)));
        }
        System.out.println(orangeBox1.boxWeight());
        System.out.println(orangeBox2.boxWeight());
        System.out.println(appleBox1.boxWeight());
        System.out.println(appleBox2.boxWeight());
        System.out.println(goldenAppleBox1.boxWeight());
        System.out.println(goldenAppleBox2.boxWeight());
        orangeBox1.move(orangeBox2);
        appleBox1.move(appleBox2);
        goldenAppleBox1.move(goldenAppleBox2);
        System.out.println(orangeBox1.boxWeight());
        System.out.println(orangeBox2.boxWeight());
        System.out.println(appleBox1.boxWeight());
        System.out.println(appleBox2.boxWeight());
        System.out.println(goldenAppleBox1.boxWeight());
        System.out.println(goldenAppleBox2.boxWeight());

        System.out.println(orangeBox1);

        appleBox2.add(new GoldenApple(5)); //В коробку с обычными яблоками можно положить золотые яблоки
        appleBox2.add(new Apple(2));
        appleBox2.add(new GoldenApple(4)); //В коробку с обычными яблоками можно положить золотые яблоки
        goldenAppleBox2.add(new GoldenApple(10));
        goldenAppleBox2.add(new GoldenApple(15));
        for (Fruit fruit : appleBox2
        ) {
            System.out.println(fruit.getClass());
        }

        System.out.println(appleBox2.boxWeight());
        appleBox2.move(goldenAppleBox2); //В коробку с обычными яблоками можно пересыпать коробку с золотыми яблоками
        System.out.println(appleBox2.boxWeight());

                //Не компилируется

//        goldenAppleBox1.add(new Apple(5)); //В коробку с золотыми яблоками нельзя положить обычные яблоки
//        goldenAppleBox2.add(new Apple(6)); //В коробку с золотыми яблоками нельзя положить обычные яблоки
//        appleBox2.add (new Orange(6)); //В коробку с обычными яблоками нельзя положить апельсины
//        goldenAppleBox2.move(appleBox2);  //В коробку с золотыми яблоками нельзя пересыпать обычные яблоки
////        goldenAppleBox2.move(orangeBox2);
//        orangeBox1.move(goldenAppleBox2);
    }
}
