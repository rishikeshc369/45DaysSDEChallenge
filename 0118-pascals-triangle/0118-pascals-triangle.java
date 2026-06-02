class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int r =0; r<numRows;r++){
            List<Integer> row = new ArrayList<>();
            long val =1;
            for(int c = 0; c <= r; c++){
                row.add((int) val);
                val= val*(r-c)/(c+1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}