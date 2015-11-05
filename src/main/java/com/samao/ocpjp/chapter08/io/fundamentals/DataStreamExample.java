package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.*;

/**
 * Created by hsamao on 11/5/15.
 */
public class DataStreamExample {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp.data"))) {
            for (int i = 0; i < 10; i++) {
                dos.writeByte(i);
                dos.writeShort(i);
                dos.writeInt(i);
                dos.writeLong(i);
                dos.writeFloat(i);
                dos.writeDouble(i);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: file was not found");
            System.out.println("Exiting...");
            System.exit(-1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("temp.data"))) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s %s %s %s %g %g %n",
                        dis.readByte(),
                        dis.readShort(),
                        dis.readInt(),
                        dis.readLong(),
                        dis.readFloat(),
                        dis.readDouble());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error: file was not found");
            System.out.println("Exiting...");
            System.exit(-1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
