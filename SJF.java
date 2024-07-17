package JavaOS;

import java.util.Scanner;

public class SJF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Proccess");
        int n = sc.nextInt();
        int[] proccessId = new int[n];
        int[] BurstTime = new int[n];
        int[] ArrivalTime = new int[n];
        int[] CompiltionTime = new int[n];
        int[] TurnArroundTime = new int[n];
        int[] waitingTime = new int[n];
        int[] flag=new int[n];
        int st=0;
        int tot=0;
        int temp;
        float AverageWaitingTime = 0;
        float AverafeTurnArroundTime = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter process" + (i + 1) + "Arrival time");
            ArrivalTime[i] = sc.nextInt();
            System.out.println("enter process" + (i + 1) + "BurstTime");
            BurstTime[i] = sc.nextInt();
            proccessId[i] = i + 1;
            flag[i]=0;
        }
        boolean a=true;
        while (true) {
            int c = n;
            int min = 999;
            if (tot == n)
                break;
            for (int i = 0; i < n; i++) {
                if ((ArrivalTime[i] <= st) && (flag[i] == 0) && (BurstTime[i] < min)) {
                    min = BurstTime[i];
                    c = i;
                }
            }
            if (c == n) {
                st++;
            } else {
                CompiltionTime[c] = st + BurstTime[c];
                st += BurstTime[c];
                TurnArroundTime[c] = CompiltionTime[c] - ArrivalTime[c];
                waitingTime[c] = TurnArroundTime[c] - BurstTime[c];
                flag[c] = 1;
                tot++;
            }
        }
        System.out.println("\n Process id "+"\t"+"Arrival Time"+"\t"+"Burst Time"+"\t"+"complete Time"+"\t"+"\t"+"TurnArroundTimewaiting"+"\t"+"WaitingTime");
            for (int i=0;i<n;i++)
            {
                AverageWaitingTime+=waitingTime[i];
                AverafeTurnArroundTime+=TurnArroundTime[i];
                System.out.println(proccessId[i]+" \t\t\t\t\t"+ArrivalTime[i]+" \t\t\t\t\t"+BurstTime[i]+" \t\t\t\t\t"+CompiltionTime[i]+"\t\t\t\t\t"+TurnArroundTime[i]+"\t\t\t\t\t"+waitingTime[i]);

            }
        System.out.println("\nAveageWaitingTime:"+(AverageWaitingTime)/n);
        System.out.println("AverageTurnArroundTime:"+(AverafeTurnArroundTime/n));
        sc.close();
    }
}
