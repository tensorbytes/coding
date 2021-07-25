class Solution:
    def myPow(self, x: float, n: int) -> float:
        if x == 0:
            return 0

        res = 1
        if n < 0:
            x,n = 1/x,-n
        while n>0:
            # 此处的 &1 是用来判断是否是奇数,当是奇数时，需要乘以一个x
            # 如果是偶数,首次不会乘以X ,然后在后面 会将X平方, n右移一位
            if n&1:
                res *= x
            x *=x
            n >>= 1
        return res