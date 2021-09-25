# coding=utf-8
# ----------------
# author: weiyu
# create_time : 5/16/2021
# description : 



class Solution:
    def maxProfit(self, prices: list) -> int:
        size = len(prices)
        if size < 2:
            return 0

        res = 0
        for i in range(1,size):
            diff = prices[i] - prices[i - 1];
            if diff > 0:
                res += diff;

        return res;