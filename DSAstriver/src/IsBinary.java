public class IsBinary {

    public static void main(String[] args) {
        String str = "0111100110101100";

        System.out.println(isBinary(str));
    }

   static boolean isBinary(String str)
    {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i,i+1));
            if(str.substring(i,i+1).equals("0") || str.substring(i,i+1).equals("1")){

            }
            else{
                return false;
            }


        }

        return true;



    }

}