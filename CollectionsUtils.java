package com.goit.module8;


import java.util.Set;

public class CollectionsUtils {

    public static void printCollection(Set fSet) {
        System.out.println(" TYPE          NAME");
            for (Object o : fSet) {
            System.out.println(o.toString());
        }

    }
}