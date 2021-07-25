class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        fifth, ten = 0, 0
        for i in range(len(bills)):
            if bills[i] ==5:
                fifth += 1
            elif bills[i] ==10:
                if fifth == 0:
                    return False
                fifth -=1
                ten +=1
            elif bills[i] == 20:
                if fifth >=1 and ten >=1:
                    ten -=1
                    fifth -=1
                elif fifth >=3:
                    fifth -=3
                else:
                    return False

        return True