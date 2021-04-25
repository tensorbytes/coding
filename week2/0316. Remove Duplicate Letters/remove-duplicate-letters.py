class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        stack = []
        dic = dict()
        for sub in s:
            if sub not in dic.keys():
                dic[sub] = 1
            else:
                dic[sub] += 1
        for sub in s:
            if sub not in stack:
                while stack and dic[stack[-1]]>=1 and stack[-1] > sub:
                    stack.pop()
                stack.append(sub)
            dic[sub]-=1
        return ''.join(stack)