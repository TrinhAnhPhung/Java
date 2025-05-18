package com.company;
import java.util.HashMap;
import java.util.Map;
public class CountElementAppearances {
    public Map<Integer, Integer> countEleAppearances(int[] numbers)
    {
        // Sử dụng HashMap để lưu trữ số (key) và số lần xuất hiện (value)
        Map<Integer,Integer> counts = new HashMap();
        // Duyệt qua từng phần tử trong mảng
        for(int number : numbers)
        {
            // Lấy số lần đếm hiện tại của số đó (mặc định là 0 nếu chưa có)
            if (counts.containsKey(number)) {
                counts.put(number, counts.get(number) + 1);
            } else {
                counts.put(number, 1);
            }
        }
    return  counts;
    }
}
