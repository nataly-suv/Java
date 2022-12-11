package DZ6;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
 */

public class Noute {

    // атрибуты класса
    // т.к. атрибуты privete, то доступ к ним осуществляется через спец методы:
    // геттеры и сеттеры
    private int articul;
    private String model; // модель. private - модификатор доступа
    private int price; // цена
    private int ram; // оперативная память
    private int hdd; // жесткий диск
    private double diagonal; // диагональ

    // конструктор класса (принцип, по которому класс будет собираться. Имя с
    // заглавной буквы))
    // создаем на основе атрибутов. Будет вызываться сразу, когда будем в Main
    // создавать экземпляр класса
    public Noute(int articul, String model, int price, int ram, int hdd, double diagonal) {
        this.articul = articul;
        this.model = model; // this.model - ссылается на атрибут, model - передаем из вне
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
        this.diagonal = diagonal;

    }

    // правая кнопка мыши - действие с исходным кодом - generate Getters and Setters
    public int getArticul() { // получение параметра
        return articul;
    }

    public void setArticul(int articul) { // изменение параметра
        this.articul = articul;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    // переопределяем метод toString (чтобы распечатать объекты)
    public String toString() {
        return "Noute [articul=" + articul + ", model=" + model + ", price=" + price + ", ram=" + ram + ", hdd=" + hdd
                + ", diagonal=" + diagonal + "]";
    }



}
