import math
class Solution:
    def isPalindrome(self, x: int) -> bool:
        t = str(x)
        size = len(t)
        if size < 2:
            return True



        head = 0
        tail = size -1

        while head < tail :
            if t[head] != t[tail]:
                return False
            else:
                head += 1
                tail -=1

        return True
