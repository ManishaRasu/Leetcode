class Solution:
    def reverseWords(self, s: str) -> str:
        w=s.split()
        s1=w[::-1]
        s2=" ".join(s1)
        return s2
        