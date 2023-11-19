package HomeMission3OOP;

import java.util.ArrayList;
import java.util.Collections;

public class StreamComparato implements StreamServis{
    ArrayList<StudentStream> SCList = new ArrayList<>();
    public void addStreamList(StudentStream name){
        this.SCList.add(name);
    }

    public void sortSC(){
        ArrayList<Integer> countList= new ArrayList<>();
        for (int i = 0; i < SCList.size(); i++) {
            String str1 = String.valueOf(SCList.get(i));
            String[] str2 = str1.split(" ");
            int str3 = Integer.parseInt(str2[str2.length-1]);
            countList.add(str3);
        }
        System.out.println();
        System.out.println("СОРТИРОВКА ПОТОКОВ");
        System.out.println();
        for (int j = 0; j < SCList.size(); j++) {
            for (int i = 0; i < SCList.size(); i++) {
                if (i == SCList.size() - 1) {
                    break;
                }
                if (countList.get(i) < countList.get(i + 1)) {
                    Collections.swap(countList, i, i + 1);
                    Collections.swap(SCList, i, i + 1);
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Потоки: \n"+SCList+"\nКоличество потоков: "+SCList.size();
    }
}
