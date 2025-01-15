import java.util.*;
import java.io.*;

public class jeoeo {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean b[] = new boolean[n+1];
        b[1] = true;
        for(int i=2; i*i<=n; i++)
            if(!b[i])
                for(int j=i*i; j<=n; j+=i)
                    b[j] = true;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=m; i<=n; i++){
            if(!b[i])
                bw.write(i+"\n");
        }
        bw.close();
    }
}