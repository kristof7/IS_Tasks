package infoshareacademy;

public class TaskA {
    public static Integer[] countingMethod(Integer[] myInputTable) {
        int counterK = 0;
        int counterJ = 0;
        if (myInputTable == null || myInputTable.length == 0){
            return new Integer[]{};
        }
        for (int i = 0; i < myInputTable.length; i++) {
            if (myInputTable[i] > 0) {
                counterK = myInputTable[i] + counterK;
            } else if (myInputTable[i] < 0) {
                counterJ = counterJ + 1;
            }
        }
        return new Integer[]{counterK, counterJ};
    }
}
