package string;

public class StringClass {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("A" + "yllya"));

        String a = "Thilina";
        String b = "Thilina";

        boolean x = a==b;
        System.out.println("Check a==b : "+ x);
        System.out.println(a.equals(b));

        String c = new String("Lakshan");
        String d = new String("Lakshan");

        System.out.println(c==d); // both value and location
        System.out.println(a.equals(b)); //only value
    }

    public static boolean isPalindrome(String str){
        if(str == null){
            return true;
        }

        str = str.toLowerCase();

        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);

            if(start != end){
                return false;
            }
        }

        return true;
    }


    public static boolean isAnagrams(String a, String b){
        sort(a);
        sort(b);
        if(a==b){
            return true;
        }

        return false;
    }

    public static void sort(String str){
        str = str.toLowerCase();
        char[] chr = str.toCharArray();
        for(int i=0;i<chr.length; i++){
            for(int j = 0; j<chr.length - i - 1;j++){
                if(chr[j] > chr[j+1] ){
                    swap( chr, i,j);
                }
            }
        }
    }

    public static void swap(char[] chr, int i,int j){
        char temp = chr[i];
        chr[i] = chr[j];
        chr[j] = temp;
    }
}
