class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        tmp = list(s)
        size = len(tmp)
        for i in range(0,size,2*k):
            tmp[i : i+k] =  reversed(tmp[i : i+k])
        return "".join(tmp)