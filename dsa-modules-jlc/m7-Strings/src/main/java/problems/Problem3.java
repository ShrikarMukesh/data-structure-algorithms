package problems;
//Frequency of each Characters of given string with lower Alphabets

/*The lowercase letter 'a' is represented by the number 97, 'b' is represented by 98, and so on.
Thus, for a computer to store the lowercase letter 'a', it would need to store the number 97 in binary, which is 1100001.
 */

public class Problem3 {
    public static void main(String[] args) {
        String str = "shrikar";
        System.out.println(str);
        charFrequency(str);
    }
    static void charFrequency(String str){
       int n = str.length();
       int count[] = new int[26];

       for (int i=0;i<n;i++){
           char ch = str.charAt(i);
           count[ch-97]++;
       }
        for (int i=0;i<count.length;i++){
            if(count[i] > 0){
                char ch  = (char) (97 + i);
                System.out.println(ch+ "\t"+count[i] + " ");
            }

        }
    }
}
//Time comp - O(n)
//Aux space - O(26) / O(1)