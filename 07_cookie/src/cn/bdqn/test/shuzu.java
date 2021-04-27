package cn.bdqn.test;

/**
 * @author chao
 * @create 2021-02-23 10:21
 */
public class shuzu {
    public static void main(String[] args) {
        int [][][] array=new int  [][][]{{{1,2,3}},{{4,5,61}},{{7,8,9}}};
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                for (int x=0;x<array[i][j].length;x++){
                    System.out.print(array[i][j][x]+"\t");
                }
                System.out.println();
            }
        }
        String [][] arr1=new  String [3][];
        System.out.println(arr1[0]);
    }
}
