package shuffleString;

public class Main {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indices));

    }

    public static String restoreString(String s, int[] indices) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < indices.length; j++) {
               if (i==indices[j])
                result+=s.charAt(i);
            }

        }

        return result;
    }
}
