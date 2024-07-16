package JavaOS;

import java.util.Arrays;
import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Proccess");
        int n=sc.nextInt();
        int []proccessId=new int[n];
        int []BurstTime=new int[n];
        int []ArrivalTime=new int[n];
        int []CompiltionTime=new int[n];
        int []TurnArroundTime=new int[n];
        int []waitingTime=new int[n];
        int temp;
        float AverageWaitingTime=0;
        float AverafeTurnArroundTime=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter process"+(i+1)+"Arrival time");
            ArrivalTime[i]=sc.nextInt();
            System.out.println("enter process"+(i+1)+"BurstTime");
            BurstTime[i]=sc.nextInt();
            proccessId[i]=i+1;
        }
        // sort the array according to the arrival time
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-(i+1);j++)
            {
                if(ArrivalTime[j]>ArrivalTime[j+1])
                {
                    temp=ArrivalTime[j];
                    ArrivalTime[j]=ArrivalTime[j+1];
                    ArrivalTime[j+1]=temp;
                    temp=BurstTime[j];
                    BurstTime[j]=BurstTime[j+1];
                    BurstTime[j+1]=temp;
                    temp=proccessId[j];
                    proccessId[j]=proccessId[j+1];
                    proccessId[j+1]=temp;
                }
            }
        }

        for (int i=0;i<n;i++)
        {
            if (i==0)
            {
                CompiltionTime[i]=ArrivalTime[i]+BurstTime[i];
            }
            else {
                if (ArrivalTime[i]>CompiltionTime[i-1])
                {
                    CompiltionTime[i]=ArrivalTime[i]+BurstTime[i];
                }
                else {
                    CompiltionTime[i] = CompiltionTime[i - 1] + BurstTime[i];
                }
            }
            TurnArroundTime[i]=CompiltionTime[i]-ArrivalTime[i];
            waitingTime[i]=TurnArroundTime[i]-BurstTime[i];
            AverageWaitingTime+=waitingTime[i];
            AverafeTurnArroundTime+=TurnArroundTime[i];
        }

        System.out.println("\n Process id "+"\t"+"Arrival Time"+"\t"+"Burst Time"+"\t"+"complete Time"+"\t"+"\t"+"TurnArroundTimewaiting"+"\t"+"WaitingTime");
        for (int i=0;i<n;i++)
        {
            System.out.println(proccessId[i]+" \t\t\t\t\t"+ArrivalTime[i]+" \t\t\t\t\t"+BurstTime[i]+" \t\t\t\t\t"+CompiltionTime[i]+"\t\t\t\t\t"+TurnArroundTime[i]+"\t\t\t\t\t"+waitingTime[i]);
        }
        sc.close();
        System.out.println("\nAveageWaitingTime:"+(AverageWaitingTime)/n);
        System.out.println("AverageTurnArroundTime:"+(AverafeTurnArroundTime/n));
    }
}
