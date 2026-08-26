class Solution:
    def checkValidString(self, s: str) -> bool:
        lmin = 0 
        lmax = 0

        for char in s:
            if char == '(':
                lmin += 1
                lmax += 1

            elif char == ')':
                lmin = max(lmin - 1, 0)
                lmax -= 1
                if (lmax < 0):
                    return False

            elif char == '*':
                lmin = max(lmin - 1, 0)
                lmax += 1
           
        return lmin == 0
