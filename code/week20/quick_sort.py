from typing import List
import random

def quick_sort(data:List[int]):
    _quick_sort_between(data, 0, len(data) - 1)


def _quick_sort_between(a:List[int],low:int,high:int):
    if low < high:

        # 随机一个数作为中心点
        #k = random.randint(low, high)
        #a[low], a[k] = a[k], a[low]

        m = _partition(a,low,high)
        _quick_sort_between(a, low, m - 1)
        _quick_sort_between(a, m + 1, high)



def _partition(a: List[int], low: int, high: int):
    pivot, j = a[low], low
    # low是第一个元素是上一步随机得到的中心点值 ,从第二个元素开始比较直到最后一个元素
    # 该函数的作用是将 小于 中心点的值放到 中心点左边, 大于中心点的值放到中心点右边, 并将中心点放在对应的位置上
    # 此处通过 j 来 维护了一个 比 中心值小的区间。 比j 小的 都是小于中心值的
    for i in range(low + 1, high + 1):
        if a[i] <= pivot:
            j += 1
            a[j], a[i] = a[i], a[j]  # swap
    a[low], a[j] = a[j], a[low]
    return j



def test_quick_sort():
    a1 = [5,2,4,6,4,3,8]
    quick_sort(a1)
    assert a1 == [3, 5, 6, 7, 8]
    a2 = [2, 2, 2, 2]
    quick_sort(a2)
    assert a2 == [2, 2, 2, 2]
    a3 = [4, 3, 2, 1]
    quick_sort(a3)
    assert a3 == [1, 2, 3, 4]
    a4 = [5, -1, 9, 3, 7, 8, 3, -2, 9]
    quick_sort(a4)
    assert a4 == [-2, -1, 3, 3, 5, 7, 8, 9, 9]


if __name__ == "__main__":
    a1 = [5,2,4,6,4,3,8]
    a2 = [2, 2, 2, 2]
    a3 = [4, 3, 2, 1]
    a4 = [5, -1, 9, 3, 7, 8, 3, -2, 9]
    quick_sort(a1)
    print(a1)
    quick_sort(a2)
    print(a2)
    quick_sort(a3)
    print(a3)
    quick_sort(a4)
    print(a4)