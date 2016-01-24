package com.goit.module8;

import com.goit.module3.files.File;

import java.util.Comparator;

public class FileNameComparator implements Comparator<File> {
            public int compare(File f1, File f2) {
        return f1.getFileName().compareToIgnoreCase(f2.getFileName());
        }
}