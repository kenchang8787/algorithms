
public class Solution {
    public String convert(String s, int numRows) {

        /*
         * 將字串以鋸齒形依照傳入的numRows決定高度進行排列, 並輸出由上至下, 由左至右的字母字串
         * 想法如下
         * 第一層和最後一層的字母之間index的間距固定是: 高度+(高度-2),
         * 而中間層的每兩個字母的間距 i, j 必會符合 i+j = 高度+(高度-2),
         * 並 i=distance - (rowIndex - 1) * 2, j= distance - i
         * 因為要排列成鋸齒狀, 故間距會符合以下特點(字串為PAHNAPLSIIGYIR, 以高度4為例)
         * maxLength = 14
         * distance = 4 + (4-2) = 6
         * row1: 0, 0+(6)=6, 6+(6)=12 ------------------------ 第一層距離為 6
         * row2: 1, 1+(4)=5, 5+(2)=7, 7+(4)=11, 11+(2)=13 ---- 第二層依序距離為 4, 2
         * row3: 2, 2+(2)=4, 4+(4)=8, 8+(2)=10 --------------- 第三層依序距離為 2, 4
         * row4: 3, 3+(6)=9 ---------------------------------- 最後一層距離為 6
         * 
         */

        String result = "";

        final String[] stringArray = s.split("");
        final int distance = numRows + (numRows - 2);

        if (distance <= 0)
            return s;

        // 每次填入一整層的字元
        for (int i = 1; i <= numRows; i++) {

            // 每一層的起點都是 rowIndex-1
            int index = i - 1;

            // 若起點尚未超過字串長度
            if (index < stringArray.length)
                result += stringArray[index];
            else
                break;

            // 為第一層或最後一層時, 間距固定為distance
            if (i == 1 || i == numRows) {
                while (index < stringArray.length) {
                    index += distance;

                    if (index < stringArray.length)
                        result += stringArray[index];
                    else
                        break;
                }
            }
            // 中間層, 兩個字母一組, 間距總和固定為distance
            else {
                while (index < stringArray.length) {

                    // index += 第一個字母距離
                    index += distance - ((i - 1) * 2);

                    if (index < stringArray.length)
                        result += stringArray[index];
                    else
                        break;

                    // index += 第二個字母距離
                    index += ((i - 1) * 2);

                    if (index < stringArray.length)
                        result += stringArray[index];
                    else
                        break;
                }
            }
        }

        return result;
    }
}
