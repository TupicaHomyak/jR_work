

/*
Цена яблок
*/

public class nhn {
    public static void main(String[] args) { //1 метод main() вызывает метод addPrice() 2 раза
        Apple apple = new Apple();
        apple.addPrice(50); //2 первый раз с параметром 50
        Apple apple2 = new Apple();
        apple2.addPrice(100); //3 второй раз с параметром 100
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;  //Исходное значение переменной applesPrice внутри класса Apple = 0

        public static void addPrice(int applesPrice) { //4 Для того чтобы в статическом методе addPrice объявить и присвоить значение локальной переменной applesPrice
            Apple.applesPrice = Apple.applesPrice + applesPrice; //5 перед ней нужно указать имя класса: Apple.applesPrice;

        }
    }
}




    class Cat {
        private static int catsCount = 0;

        public static void addNewCat() {
            catsCount++;

        }

        public static void main(String[] args) {

        }
    }
