class D2Array {
    public static void main(String...args) {
        int r=3;
        int c=3;
        int[][] array = new int[r][c];
        int num=1;
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                array[i][j]=num++;
            }
        }
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
