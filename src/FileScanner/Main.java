package FileScanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        ConsoleReader reader = new ConsoleReader();
//        System.out.println(reader.read());
//        FileReader fileReader = new FileReader(new java.io.File("C:\\Users\\SancheeZzz\\File4Read.txt"));
//        System.out.println(fileReader.read());
//        FileScanner fScan= new FileScanner(new java.io.File("C:\\Users\\SancheeZzz\\ForTest"));
//        System.out.println(fScan.scan("Tinker"));
        RecursiveScanner recScan = new RecursiveScanner(new java.io.File("C:\\Users\\SancheeZzz\\ForTest"));
        System.out.println(recScan.scan("Tinker"));
    }
}
