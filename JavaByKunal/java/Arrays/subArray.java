public class subArray {
    public static void main(String []args){
        int[] myarr = {10,20,30,40,50};

        for (int i = 0; i < myarr.length; i++) {
            for (int j = i; j < myarr.length; j++) {
                // System.out.println();
                for (int k = i; k <= j; k++) {
                    System.out.print(myarr[k]+" ");
                }
                System.out.println();
            }
        }
    }
} 
