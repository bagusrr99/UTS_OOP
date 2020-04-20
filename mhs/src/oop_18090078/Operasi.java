package oop_18090078;

import java.util.LinkedList;
import java.util.List;

public class Operasi {

    private static List<Data> listData = new LinkedList<Data>();

    public static void addData(Data data) {
        listData.add(data);
    }

    public static void editData(Data data, int idx) {
        listData.set(idx, data);
    }

    public static void removeData(int idx) {
        listData.remove(idx);
    }

    public static List<Data> getListData() {
        return listData;
    }
}
