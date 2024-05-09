package org.example.file;

import java.io.FileWriter;
import java.io.IOException;

public class Filesavecss {
    public static void SavetoCSS(StringBuilder stringBuilder,String path){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write(stringBuilder.toString());
        }catch (IOException e){
            e.getMessage();
        }

    }
}
