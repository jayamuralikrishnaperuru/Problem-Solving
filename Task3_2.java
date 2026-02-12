import java.util.Scanner;

public class Task3_2 {
    public static String getSmallestAndLargest(String s, int k) {
        // Initialize with the first substring of length k
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Loop through all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);

            if (sub.compareTo(smallest) < 0) {
                smallest = sub;
            }

            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}