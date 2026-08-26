import heapq

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqmap = {}

        for num in nums:
            freqmap[num] = freqmap.get(num, 0) + 1

        heap = [(-freq, num) for num, freq in freqmap.items()]
        heapq.heapify(heap)

        ans = []

        for _ in range(k):
            freq, num = heapq.heappop(heap)
            ans.append(num)

        return ans