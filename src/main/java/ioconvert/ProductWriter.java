package ioconvert;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class ProductWriter {

    public void saveProduct(OutputStream os, List<Productx> products) {
        try (PrintStream pw = new PrintStream(os)) {
            for (Productx prod : products) {
                pw.print(prod.getName());
                pw.print(";");
                pw.print(prod.getPrice());
                pw.println();
            }
        }
    }
}
