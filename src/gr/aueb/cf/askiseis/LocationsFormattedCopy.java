package gr.aueb.cf.askiseis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class LocationsFormattedCopy {

    public static void main(String[] args) {
        String inFile = "C:\\Users\\nikko\\Locations.txt";
        String outFile = "C:\\Users\\nikko\\Locations-out.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFile));
             PrintStream ps = new PrintStream(outFile, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",");
                printTextFormatted(ps, tokens);
                printTextFormatted(System.out, tokens);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void printTextFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ location: '%s', latitude: %s, longitude: %s },\n", tokens[0], tokens[1], tokens[2]);
    }
}
