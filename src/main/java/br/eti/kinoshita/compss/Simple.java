package br.eti.kinoshita.compss;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Simple {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Simple running at " + InetAddress.getLocalHost().getHostName());
        String counterName = "counter";
        int initialValue = Integer.parseInt(args[0]);

        // Initialize counter (c -> 1)
        try (FileOutputStream fos = new FileOutputStream(counterName)) {
            fos.write(initialValue);
            fos.flush();
            System.out.println("Initial counter value is " + initialValue);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Execute increment (c -> 2)
        for (int i = 0; i < initialValue; i++) {
            SimpleImpl.increment(counterName);
        }

        // Open the file and print final counter value (should be 2)
        try (FileInputStream fis = new FileInputStream(counterName)) {
            System.out.println("Final counter value is " + fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
