
import parsers.FileParser;
import parsers.ParserRegistry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Press filename");
        String filename = scan.nextLine();

        String extension = filename.split("\\.")[1];

        FileParser parser = ParserRegistry.getParser(extension);
        String[] strings = parser.parseFile(filename);

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
