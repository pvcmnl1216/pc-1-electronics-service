package com.jap;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ElectronicListService {
    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        itemList.add("computer");
        itemList.add("Refrigerator");
        itemList.add("smartphone");
        itemList.add("printer");
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        List<String> list = new ArrayList();
        ListIterator<String> iterator = itemList.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
        }
        return 1;
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        boolean flag = false;
        List<String> list = new ArrayList<>();
        ListIterator<String> iterator = itemList.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
        }

        return flag;
    }


}
