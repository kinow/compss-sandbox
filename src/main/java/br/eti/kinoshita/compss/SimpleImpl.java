package br.eti.kinoshita.compss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleImpl {

    public static void increment(String counterFile) {
        try {
            Thread.sleep(1000);
            FileInputStream fis = new FileInputStream(counterFile);
            int count = fis.read();
            fis.close();

            FileOutputStream fos = new FileOutputStream(counterFile);
            fos.write(++count);
            fos.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}