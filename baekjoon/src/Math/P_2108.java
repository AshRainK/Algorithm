import java.io.*;
import java.util.*;

public class P_2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> checker = new HashMap<>();
        Set<Integer> numbers = new HashSet<>();
        List<Integer> same = new ArrayList<>();
        double sum = 0;
        int count;
        List<Integer> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i =0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            arr.add(num);
            sum += num;
            numbers.add(num);
            if(checker.containsKey(num)){
                checker.replace(num,checker.get(num)+1);
            } else
                checker.put(num,1);
        }

        Collections.sort(arr);

        Integer[] nums = numbers.toArray(new Integer[0]);
        Arrays.sort(nums);

        int maxNum = nums[0];
        int max = checker.get(maxNum);
        count = 1;
        for(int i = 1; i<nums.length; i++){
            int tempNum = nums[i];
            int temp = checker.get(tempNum);
            if(temp > max){
                max = temp;
                maxNum = tempNum;
                count = 0;
            }
            if(temp == max)
                count ++;
        }
        int cnt = 0;
        if(count > 1){
            for(int i =0; i<nums.length; i++){
                int temp = nums[i];
                int freq = checker.get(temp);
                if(freq == max)
                    same.add(nums[i]);
            }
        }
        Collections.sort(same);
        bw.write(Math.round(sum/arr.size())+"\n");
        bw.write(arr.get(arr.size()/2)+"\n");
        if(count > 1)
            bw.write(same.get(1)+"\n");
        else
            bw.write(maxNum+"\n");
        bw.write(arr.get(N-1)-arr.get(0)+"");
        bw.flush();
    }


}
