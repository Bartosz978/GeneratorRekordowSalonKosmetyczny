package org.example.file;

import java.io.FileWriter;
import java.io.IOException;

public class Filesavecss {
    public static void SavetoCSS(StringBuilder stringBuilder,String path){
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();
        }catch (IOException e){
            e.getMessage();
        }

    }
}
