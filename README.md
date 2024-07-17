# Operating-System
**FCFS (FIRST-COME, FIRST-SERVED) Scheduling**
FCFS Scheduling algorithm automatically executes the queued processes and requests in the order of their arrival. It allocates the job that first arrived in the queue to the CPU, then allocates the second one, and so on.
**Mathematical Examples**
1. **Arrival time (AT)** − Arrival time is the time at which the process arrives in ready queue. 
2. **Burst time (BT) or CPU time of the process** − Burst time is the unit of time in which a particular process completes its execution.
3. **Completion time (CT**) − Completion time is the time at which the process has been terminated.
4. **Turn-around time (TAT)** − The total time from arrival time to completion time is known as turn-around time. TAT can be written as **Turn-around time (TAT) = Completion time (CT) – Arrival time (AT) or, TAT = Burst time (BT) + Waiting time (WT)**.
5. **Waiting time (WT)** − Waiting time is the time at which the process waits for its allocation while the previous process is in the CPU for execution.
6. **Response time (RT)** − Response time is the time at which CPU has been allocated to a particular process first time.
In case of non-preemptive scheduling, generally Waiting time and Response time is same.
7. **Gantt chart** − Gantt chart is a visualization which helps to scheduling and managing particular tasks in a project. It is used while solving scheduling problems, for a concept of how the processes are being allocated in different algorithms.
![Screenshot 2024-07-17 090828](https://github.com/user-attachments/assets/708e1159-db64-450a-b9b8-4b213fc7633e)
### Shortest Job First (SJF) Scheduling:-
An Operating System uses a variety of algorithms to efficiently arrange the operations for the processor, Shortest Job First (SJF) algorithm is one of them. In the Shortest Job First algorithm, the CPU will be assigned a job with the smallest burst time first, and the processes in the queue with the shorter burst time will be received and executed by the CPU more quickly.
![Screenshot 2024-07-17 085748](https://github.com/user-attachments/assets/fe9cc576-49ab-4434-aa8d-1849b95b48ba)
