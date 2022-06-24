// 56. Merge Intervals
class Solution {
   public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (val1, val2) ->
                    Integer.compare(val1[0], val2[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int lsp = intervals[0][0];
        int lep = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            int sp = intervals[i][0];
            int ep = intervals[i][1];

            if(sp > lep) {
                // new interval is here
                /// lpoi comm nahi h 
                int[] subinterval = {lsp, lep};
                list.add(subinterval);
                lsp = sp;
                lep = ep;
            } else if(lep < ep) {
                // partial merging
                lep = ep;
            } else {
                // new interval is already covered in lsp and lep
            }
        }
        int[] subinterval = {lsp, lep};
        list.add(subinterval);
        return list.toArray(new int[list.size()][]);
    }
}