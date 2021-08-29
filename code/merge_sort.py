
from typing import List

def merge_sort(data:List[int]):

    # 这里还要再定义一个函数是因为递归的参数需要作为方法参数传递
    _merge_sort_between(data,0,len(data)-1)


def _merge_sort_between(a:List[int],low:int,high:int):
    if low < high:
        mid = low + int((high - low)/2)
        _merge_sort_between(a,low,mid)
        _merge_sort_between(a,mid+1,high)
        _merge(a,low,mid,high)

# 调整顺序用
def _merge(a:List[int],low:int,mid:int,high:int):
    i,j = low,mid + 1

    tmp = []
    while i<=mid and j <= high:
        if a[i] <= a[j]:
            tmp.append(a[i])
            i += 1
        else:
            tmp.append(a[j])
            j += 1

    # 存在 只有i 或者 j 增加的情况,剩下的要加入tmp中
    start =i if i <= mid else j
    end =mid if i <= mid else high
    tmp.extend(a[start:end+1])
    a[low:high+1] = tmp


def test_merge_sort():
    a1 = [3, 5, 6, 7, 8]
    merge_sort(a1)
    assert a1 == [3, 5, 6, 7, 8]
    a2 = [2, 2, 2, 2]
    merge_sort(a2)
    assert a2 == [2, 2, 2, 2]
    a3 = [4, 3, 2, 1]
    merge_sort(a3)
    assert a3 == [1, 2, 3, 4]
    a4 = [5, -1, 9, 3, 7, 8, 3, -2, 9]
    merge_sort(a4)
    assert a4 == [-2, -1, 3, 3, 5, 7, 8, 9, 9]

if __name__ == "__main__":
    a1 = [3, 5, 6, 7, 8]
    a2 = [2, 2, 2, 2]
    a3 = [4, 3, 2, 1]
    a4 = [5, -1, 9, 3, 7, 8, 3, -2, 9]
    merge_sort(a1)
    print(a1)
    merge_sort(a2)
    print(a2)
    merge_sort(a3)
    print(a3)
    merge_sort(a4)
    print(a4)