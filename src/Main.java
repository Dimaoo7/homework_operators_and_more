public class Main {
    public static void main(String[] args) {

        //Первое задание

       int age = 13;

        if (age >= 18 ) {
            System.out.println("Тебе уже больше 18 лет");
        }
        if (age <= 17) {
            System.out.println("Тебе еще нет 18 лет, подожди " + ( 18 - age )+ " лет");
        }

        //Второе задание
        int temperetura = -2;

        if (temperetura >= 5) {

            System.out.println("Сегодня тепло " + temperetura + " Градуса");
        }
        if (temperetura <= 5) {
            System.out.println("Апчи, а сегодня холодно " + temperetura + " Градуса");
        }

        //Третье задание
        int speed = 120;
        if (speed >= 60) {
            System.out.println("Ты привысил скорость, твоя скорость сейчас " +speed+ " км в час");
        }
        if (speed <= 60) {
            System.out.println("Ты не привысил скорость, твоя скорость сейчас " +speed+ " км в час");
        }

        // Четвертая задача
        int age_person = 40;

        if (age_person >= 2 && age_person <= 6 ){
            System.out.println("Иди в детский сад, тебе "+age_person+ " года");
        }
        if (age_person >= 7 && age_person <= 18){
            System.out.println("Иди в школу, тебе "+age_person+ " лет");
        }
        if (age_person > 18 && age_person <= 24){
            System.out.println("Иди в университет, тебе "+age_person+ " лет");
        }
        if (age_person > 24){
            System.out.println("Иди работать, тебе "+age_person+ " лет");
        }

        // Пятая задача
        int age_old = 3;
        boolean older = true;

        if (age_old > 5){
            System.out.println("Он не может кататься на атракционе");
        }

        if (age_old >= 5 && age_old < 14 && older == true) {
            System.out.println("Он может кататься но только со взрослыми");
        }
            else System.out.println("Он не может кататься на атракционе");
        if (age_old > 14) {
            System.out.println("Он может кататься один");
        }
        //Шестая задача

        int capacity = 85;

        if (capacity < 102) {
            System.out.println("Осталось " + (102 - capacity) + " мест");
        }
        else System.out.println("Мест больше нет");
        if (capacity > 60) {
            System.out.println(102 - 60 + " человека будут стоять");
        }

        //Седьмая задача
        int one = 150;
        int two = 104;
        int three = -4;

        if (one > two){
            if (one > three) {
                System.out.println("Самое большое число: " + one + " one");
            }
            else System.out.println("Error");
        }
        if (two > one){
            if (two > three) {
                System.out.println("Самое большое число: " + two + " two");
            }
            else System.out.println("Error");
        }
        if (three > two){
            if (three > one) {
                System.out.println("Самое большое число: " + three + " three");
            }
            else System.out.println("Error");
        }
    }

}
