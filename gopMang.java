public class gopMang {
        public static void main(String[] args) {
            int [] mang1 = {1,2,3,4,5,6};
            int [] mang2 = {7,8,9};
            int [] mang3;
            mang3 = new int[(mang1.length + mang2.length)];
            System.arraycopy(mang1,0,mang3,0,4);
            System.arraycopy(mang2,0,mang3,4,3);
            for(int k : mang3){
                System.out.print(k + " ");
            }


        }
    }