import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class btArrayList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        int a[] = new int[5];
        int sum = 0;
        float average;
        Scanner it = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            number.add(a[i]);
            a[i] = it.nextInt();
            sum = sum + a[i];
        }
        average = sum / 5;
        System.out.println(number);
        System.out.println("nhiệt độ trung bình là :" + average);


        a[1] =1;
        while(a[1] > average){
            System.out.println("nhiệt độ lớn hơi nhiệt đọ trung bình là:"+a[1]);
            a[1]++;
        }
    }
}
