package Homework7;

public class AnimalsRunner {

    public static void main(String[] args) {


        Dog Tuzik = new Dog("Тузик","Черный","Собака",16," Лает.");
        Dog Sharik = new Dog("Шарик","Белый", "Собака", 7, " Лает.");
        Cats Kuzia = new Cats("Кузя","Трехцветный", "Кот", 5," Мяукает.");
        Cats Buch = new Cats("Буч","Коричневый", "Кот", 4," Мяукает.");
        Parrot Kesha = new Parrot("Кеша","Пестрый","Попугай",2," Говорит.");
        bat Homa = new bat("Хома","Серый","ШЛетучая мышь",1," Не издает звуков.");

        Animals[] pets = new Animals[] {Tuzik,Sharik,Kesha,Kuzia,Buch,Homa};

        System.out.println(Tuzik);
        System.out.println(Sharik);
        System.out.println(Kesha);
        System.out.println(Kuzia);
        System.out.println(Homa);
        System.out.println(Buch);




    }

}
