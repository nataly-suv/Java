/*
 * 
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
 * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
 * 
 * 
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.*;

public class Seminar2Task5 {
    private static Logger logger = Logger.getLogger(Seminar2Task5.class.getName());

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Seminar2Task5.class.getName());
        FileHandler fh = new FileHandler("Seminar2Task5Log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        writer();
    }

    public static ArrayList<String> getFiles() throws IOException {
        File file = new File("F:\\");
        File[] files = file.listFiles();
        ArrayList<String> names;
        try {
            names = new ArrayList<String>(Arrays.asList(file.list()));
            return names;
        } catch (NullPointerException nullPointerException) {

            logger.log(Level.WARNING, "Файлы не найдены в этой папке");

        }
        return null;
    }

    public static void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Seminar2Task5.txt");
        try {

            ArrayList<String> files = getFiles();

            for (String file : files) {
                file += "\n";
                fileOutputStream.write(file.getBytes());
            }
        } catch (NullPointerException nullPointerException) {

            logger.info("В предыдущем методе файл вернул null");
        }
    }
}
