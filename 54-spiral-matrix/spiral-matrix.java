class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr=0;
        int er=matrix.length-1;
        int sc=0;
        int ec=matrix[0].length-1;
        List<Integer> result = new ArrayList<>();
        while(er>=sr && ec>=sc){
            for(int i=sc;i<=ec;i++){
               result.add(matrix[sr][i]);
            }
            for(int i=sr+1;i<=er;i++){
               result.add(matrix[i][ec]);
            }
            if(sr<er){
                for(int i=ec-1;i>=sc;i--){
                   result.add(matrix[er][i]);
                }
            }
            if(sc<ec){
                for(int i=er-1;i>sr;i--){
                   result.add(matrix[i][sc]);
                }
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return result;
    }
    }