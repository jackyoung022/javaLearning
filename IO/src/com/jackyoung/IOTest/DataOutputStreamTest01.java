package com.jackyoung.IOTest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("myfile"));
        int i = 10;
        long l = 400L;
        byte b = 100;
        short s = 200;
        float f = 3.0F;
        double d = 3.14;
        boolean sex = true;
        char c = 'a';

        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}
