package test5_18;

import java.util.Stack;

/**
 *
 * 901. 股票价格跨度
 * 编写一个 StockSpanner 类，它收集某些股票的每日报价，并返回该股票当日价格的跨度。
 *
 * 今天股票价格的跨度被定义为股票价格小于或等于今天价格的最大连续日数（从今天开始往回数，包括今天）。
 *
 * 例如，如果未来7天股票的价格是 [100, 80, 60, 70, 60, 75, 85]，那么股票跨度将是 [1, 1, 1, 2, 1, 4, 6]。
 * @author Q
 * @create 2020-05-18-8:30
 */
public class StockSpanner {
    Stack<Integer> prices,weights;
    public StockSpanner() {
        prices=new Stack<>();
        weights=new Stack<>();
    }

    public int next(int price) {
        int w=1;
        while (!prices.isEmpty()&&prices.peek()<=price){
            prices.pop();
            w+=weights.pop();

        }


        prices.push(price);
        weights.push(w);
        return w;
    }

}
