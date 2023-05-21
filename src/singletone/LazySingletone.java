
package singletone;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class LazySingletone {
    private String[] letters={"a","b","c","d"};
    private static LazySingletone instance;
    public static LazySingletone getInstance(){
        if (instance==null){
            instance=new LazySingletone();
        }
        return instance;
    }


    private List<String>data=Arrays.asList(letters);
    private LazySingletone(){
        Collections.shuffle(data);
    }
    public void printData(){
        for (String i:data){
            System.out.printf("%s",i);
        }
        System.out.println();
    }

}

