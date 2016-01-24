package com.goit.module8;

import com.goit.module3.files.*;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Set<File> dirSet = new TreeSet<>(new FileNameComparator());

        Directory listOfFiles = new Directory("Directory file");
        File audioFile = new AudioFile("Song file");
        File imageFile = new ImageFile("Picture file");
        File textFile = new TextFile("Text file");

        listOfFiles.getDirectory().add(audioFile);
        listOfFiles.getDirectory().add(imageFile);
        listOfFiles.getDirectory().add(textFile);

        dirSet.add(audioFile);
        dirSet.add(imageFile);
        dirSet.add(textFile);
        dirSet.add(listOfFiles);

        CollectionsUtils.printCollection(dirSet);
    }
}