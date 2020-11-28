//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> hmp = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hmp.put(name, Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hmp.containsKey(s)){
                System.out.println(s + "=" + hmp.get(s));
            }
            else
                System.out.println("Not found");
        }
        in.close();
    }
}