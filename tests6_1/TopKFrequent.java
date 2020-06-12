package test5_31;

import java.util.*;

/**
 * 692. 前K个高频单词
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 *
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 * @author Q
 * @create 2020-05-31-19:18
 */
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> count=new LinkedHashMap<>();
        for (String s:words) {
            count.put(s,count.getOrDefault(s,0)+1);
        }
        LinkedList<String> linkedList=new LinkedList<>(count.keySet());
        for (int i = 0; i <k; i++) {

        }
        Collections.sort(linkedList,(l1,l2)->count.get(l1).equals(count.get(l2))?
                l1.compareTo(l2):count.get(l2)-count.get(l1));

        return linkedList.subList(0,k);
    }
}
