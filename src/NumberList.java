import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberList {
    private Integer min_NL;
    private Integer max_NL;
    private List<Integer> list;

    public void RandList(Integer min, Integer max) {
        java.util.Random rand = new Random();
        list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(rand.nextInt(min, max));
        }
    }
    private void listMin(List<Integer> list){
        min_NL = list.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
        System.out.println(min_NL);
    }
    private void listMax(List<Integer> list){
        max_NL = list.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        System.out.println(max_NL);
    }
    public void modifyListByRange(Integer min, Integer max){
        List<Integer> temp = new ArrayList<>();
        for (Integer i : list){
            if(i >= min && i <= max){
                temp.add(i);
            }
        }
        list.clear();
        list.addAll(temp);
        listMin(list);
        listMax(list);
    }
    public NumberList(Integer min, Integer max){
        list = new ArrayList<>();
        RandList(min, max);
        listMin(list);
        listMax(list);
    }
    public void PrintList(){
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
