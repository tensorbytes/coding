class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        for i in strs:
            keys = "".join(sorted(i))
            if keys not in hashmap:
                hashmap[keys] = [i]
            else:
                hashmap[keys].append(i)
        return list(hashmap.values())