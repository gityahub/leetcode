import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    List<Integer> list;
    public MedianFinder() {
        list=new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
    }

    public double findMedian() {
        list.sort((a,b)->(a-b));
        if(list.size()%2==1) return list.get(list.size()/2);
        else return (list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
    }
}
