//package ispan;
//
//public class homework3_2 {
//
//    static int[] eachsales(int[][] table, int[] pricetable , String[] employee) {
//
//        int[] sum = new int[employee.length];
//        System.out.println(employee.length);
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {
//                System.out.println(pricetable[j]);
//                sum[i] += table[i][j] * pricetable[j];
//            }
//
//        }
//
//        for (int i = 0 ; i < sum.length;i++){
//
//            System.out.println(employee[i]+"的銷售金額:"+sum[i]);
//        }
//    return sum;
//    }
//
//     static void bestsellers(int[] sales, String[] names ) {
//        int max = sales[0];
//        int max2 = 0;
//        for (int i =1 ; i < sales.length;i++ ){
//
//            if (max < sales[i]){
//                max = sales[i];
//                max2 = i;
//            }
//
//        }
//        if (names[0].equals("A")){
//            System.out.println("最佳銷售產品: "+ names[max2]);
//
//        }
//        else {
//            System.out.println("最佳銷售員: "+names[max2]);
//        }
//
//    }
//
//
//    static int[] eachproduct(int[][] table,int[] price,String[] product){
//        int[] sum1 = new int[price.length];
//        for (int i = 0; i < table[0].length;i++){   //5個產品所以把table[i].length=5 ,放在外圈
//            for(int j =0; j < table.length ;j++){
//                sum1[i] += table[j][i];     //把每一項產品的銷售總金額加起來
//            }
//        }
//
//
//        for (int i = 0; i < sum1.length ; i++){
//            System.out.println("產品"+ product[i]+" : "+sum1[i]);
//        }
//        return sum1;
//    }
//
//
//
//    public static void main(String[] args) {
//        int[][] sumsales = new int[][]{{33,32,56,45,33},
//                                       {77,33,68,45,23},
//                                       {43,55,43,67,65}
//        };
//        int[] eachmoney = new int[]{12,16,10,14,15};
//        String[] salers = new String[]{"Jean","Tom","Tina"};
//        String[] products = new String[]{ "A", "B", "C", "D", "E" };
//        System.out.println("每一個銷售員的銷售總金額: ");
//        int[] sum =eachsales(sumsales,eachmoney,salers);
//        System.out.println("有最好業績（銷售總金額最多者）的銷售員: ");
//        bestsellers(sum,salers);
//        System.out.println("每項產品的銷售總金額: ");
//        int[] sum1=eachproduct(sumsales, eachmoney,products);
//        System.out.println("銷售總金額最多的產品: ");
//        bestsellers(sum1,products);
//
//    }
//}
