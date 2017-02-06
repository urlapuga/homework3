/**
 * Created by Андрей on 06.02.2017.
 */
public class Bird {
    void sing(String[] what){
        for(int i=0;i<what.length;i++){
            System.out.printf("I am %s%n", what[i]);
        }
    }
}
