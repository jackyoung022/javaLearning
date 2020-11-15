package com.jackyoung.IOTest;

import java.io.*;

public class copyDir {
    public static void main(String[] args) {
        File srcDir = new File("D:/壁纸");
        File destDir = new File("F:/壁纸");
        doCopy(srcDir,destDir);
    }

    private static void doCopy(File srcDir, File destDir) {
        if(srcDir.isDirectory()){
            if(!destDir.exists()){
                destDir.mkdirs();
            }
            String[] files = srcDir.list();
            for(String file : files){
                File srcFile = new File(srcDir, file);
                File destFile = new File(destDir, file);
                doCopy(srcFile, destFile);
            }
        }else {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = new FileInputStream(srcDir);
                out = new FileOutputStream(destDir);
                byte[] bytes =  new byte[1024 * 1024];
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


}
