
class Node(object):
    def __init__(self,ch):
        self.ch = ch
        self.next = {}
        self.isEnd = False

class Trie:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = Node("")


    def insert(self, word: str) -> None:
        """
        Inserts a word into the trie.
        """
        node = self.root
        for c in word:
            tmp = node.next.get(c,None)
            if tmp is None:
                tmp = Node(c)
                node.next[c] = tmp
            node = tmp
        node.isEnd = True

    def search(self, word: str) -> bool:
        """
        Returns if the word is in the trie.
        """
        node = self.root
        for c in word:
            node = node.next.get(c,None)
            if node is None:
                return False
        return node.isEnd == True


    def startsWith(self, prefix: str) -> bool:
        """
        Returns if there is any word in the trie that starts with the given prefix.
        """
        node = self.root
        for c in prefix:
            node = node.next.get(c,None)
            if node is None:
                return False
        return True



    # Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)