public class OOP2_10 {
    public static void main(String[] args) {
        int[][]array=new int[4][4];

        //배열의 원소가 0이면 랜덤값을 넣고, 0이 아니면 i--를 반복합니다.
        for(int i=0;i<10;i++) {
            int a = (int) (Math.random() * 4 + 0);
            int b = (int) (Math.random() * 4 + 0);
            if (array[a][b] == 0) {
                array[a][b] = (int) (Math.random() * 10 + 1);
            }else{
                i--;
            }
        }

        //배열의 원소를 출력합니다.
        for(int i=0; i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
