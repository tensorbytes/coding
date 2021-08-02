# encode=utf-8

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        size = len(s)
        dup = set()
        left = 0

        max_len = 0
        cur_len = 0

        for i in range(size):

            if s[i] in dup:
                while s[i] in dup:
                    dup.remove(s[left])
                    left += 1
                    cur_len -= 1

            cur_len +=1
            dup.add(s[i])

            if cur_len > max_len:
                max_len = cur_len
        return max_len






        return max_len



if __name__ == '__main__':
    s = Solution()
    s.lengthOfLongestSubstring("123")