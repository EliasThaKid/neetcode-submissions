class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l = 0
        r = len(matrix)-1
        sllen = len(matrix[0])-1

        while l <= r:
            mid = (l+r) // 2
            if target == matrix[mid][0]:
                return True
            elif target == matrix[mid][sllen]:
                return True 
            elif target > matrix[mid][0] and target < matrix[mid][sllen]:
                l2 = 0
                r2 = sllen 
                while l2 <= r2:
                    mid2 = (l2+r2) // 2
                    if target == matrix[mid][mid2]:
                        return True
                    elif target < matrix[mid][mid2]:
                        r2 = mid2 - 1
                    else: 
                        l2 = mid2 + 1 
                return False
            elif target < matrix[mid][0]:
                r = mid - 1
            else:
                l = mid + 1

        return False