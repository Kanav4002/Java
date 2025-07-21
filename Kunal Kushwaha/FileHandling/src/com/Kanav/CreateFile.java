package com.Kanav;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("MyDetails.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            }
        }
    }
}
