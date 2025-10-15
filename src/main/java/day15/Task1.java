package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("src\\main\\resources\\shoes.csv");
        Scanner scanner = null;


        PrintWriter pw = null;

        try {
            scanner = new Scanner(fileRead);
            pw = new PrintWriter("src\\main\\resources\\missing_shoes.txt", StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (fileRead.exists()&&fileRead.length()==0)
            throw new Denis2exception("Файл пустой");



        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] s = line.split(";\\s*");
            if (s.length!=3)
                throw new Denis2exception("Количество столбцов отличается от трёх");
            if (Integer.parseInt(s[2]) == 0) {
                pw.println(line);
            }
        }
        pw.close();
    }
}
