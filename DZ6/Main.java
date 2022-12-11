package DZ6;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // public Noute (String model, int price, int ram, int hdd, double diagonal)
        Noute noute1 = new Noute(111, "Irbis NB77", 15000, 2, 4, 13.3);
        Noute noute2 = new Noute(222, "Irbis NB257", 16000, 4, 64, 14);
        Noute noute3 = new Noute(333, "Irbis NB261", 20000, 4, 128, 15.6);
        Noute noute4 = new Noute(444, "Irbis NB290", 22000, 4, 128, 15.6);
        Noute noute5 = new Noute(555, "ASUS Vivobook", 25000, 4, 128, 14);
        Noute noute6 = new Noute(666, "Acer Aspire 1", 29000, 4, 128, 15.6);
        Noute noute7 = new Noute(777, "HP Laptop 17", 38000, 4, 256, 17.3);
        Noute noute8 = new Noute(888, "ASUS VivoBook 17", 54000, 8, 256, 17.3);
        Noute noute9 = new Noute(999, "Lenovo ThinkPad", 180000, 16, 512, 16);

        // System.out.println(noute1.getModel()); // получили модель noute1
        // System.out.println(noute1); // переопределили метод toString
        // System.out.println(noute9.getClass());

        HashSet<Noute> nouteSet = new HashSet<>(); // передали в сет объекты класса Noute
        // заполнилили Set
        nouteSet.add(noute1);
        nouteSet.add(noute2);
        nouteSet.add(noute3);
        nouteSet.add(noute4);
        nouteSet.add(noute5);
        nouteSet.add(noute6);
        nouteSet.add(noute7);
        nouteSet.add(noute8);
        nouteSet.add(noute9);

        // напечатали Set
        for (Object elem : nouteSet) {
            System.out.println(elem);
        }

        Scanner in = new Scanner(System.in);
        System.out.println(
                "По какому критерию вы хотите произвести отбор:\n" +
                        "1 - цена\n2 - объем оперативной памяти\n3 - объем жесткого диска\n4 - диагональ дисплея");
        int searchAtribut = in.nextInt();
        System.out.println("задайте диапазон (введите 2 цифры через пробел)");
        double min = in.nextDouble();
        double max = in.nextDouble();

        boolean flag = false;

        if (searchAtribut == 1) { // цена
            for (Noute elem : nouteSet) {
                if (elem.getPrice() >= min && elem.getPrice() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 2) { // объем оперативной памяти
            for (Noute elem : nouteSet) {
                if (elem.getRam() >= min && elem.getRam() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }

        } else if (searchAtribut == 3) { // hdd объем жесткого диска
            for (Noute elem : nouteSet) {
                if (elem.getHdd() >= min && elem.getHdd() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 4) { // диагональ
            for (Noute elem : nouteSet) {
                if (elem.getDiagonal() >= min && elem.getDiagonal() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("нет ноутбуков, удовлетворяющих вашему запросу");
        }

    }

    /*
     * НЕ ПОЛУЧИЛОСЬ СОЗДАТЬ МЕТОД
     * ХОТЕЛА ВЫБОРКУ СДЕЛАТЬ ОТДЕЛЬНЫМ МЕТОДОМ
     */
    // метод выборки
    // public void selection(HashSet<Class> nouteSet, String atributName, double min,
    // double max) {
    // for (Object elem : nouteSet) {
    // if (elem.getClass().getAtributName() >= min && elem.getAtributName())
    // }

    // }
}