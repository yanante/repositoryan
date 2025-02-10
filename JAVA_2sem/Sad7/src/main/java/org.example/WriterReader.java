package org.example;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReader {

    public void writeText(String word){
        try (FileWriter fw = new FileWriter("text.txt")) {
            for (int i = 0; i < word.length(); i++) {
                fw.write(word.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public String readText() {
        try (FileReader fr = new FileReader("text.txt")) {
            StringBuilder sb = new StringBuilder();
            int code = -1;
             while ((code = fr.read()) != -1) {
                sb.append(Character.toChars(code));
            }
            return sb.toString();

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            return "";
        }
    }
}
