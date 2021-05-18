class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profilt = 0
        for i in range(1, len(prices)):
            tmp = prices[i]- prices[i-1]
            if tmp >0:
                profilt += tmp
        return profilt