package LeetCodeChallenges.LeetCodeSep;

public class GasStation {

    //Approach1 : greedy
    public int canCompleteCircui(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            sumGas += gas[i];
            sumCost += cost[i];

            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return sumGas < sumCost ? -1 : start;
    }


    //Approach2 :
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a = 0;
        int b = 0;
        int res = -1;
        int len = gas.length;

        for (int ch : gas) {
            a += ch;
        }
        for (int ch : gas) {
            b += ch;
        }
        if (b > a) {
            return res;
        }

        int tank = 0;
        int count = 0;
        for (int i = 0; i < gas.length; ++i) {
            count = 0;
            tank = 0;
            for (int j = i; j < gas.length + i; ++j) {
                tank += gas[j % len];
                if (tank >= cost[j % len]) {
                    tank = tank - cost[j % len];
                    ++count;
                } else {
                    break;
                }
            }
            if (count == len)
                return i;
        }
        return res;
    }
}
