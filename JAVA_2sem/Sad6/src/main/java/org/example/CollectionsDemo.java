package org.example;
import java.util.List;

public class CollectionsDemo {
    public int BeginsWith(List<String> l, char s){
        int count = 0;
        for (String w : l) {
            if (w.charAt(0) == s) {count++;}
        }
        return count;
    }

}
