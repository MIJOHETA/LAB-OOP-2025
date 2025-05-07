package TugasPraktikum;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = scanner.nextInt();
            
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found at [" + i + "][" + j + "]");
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            
            if (!found) {
                System.out.println("Invalid Input");
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}
