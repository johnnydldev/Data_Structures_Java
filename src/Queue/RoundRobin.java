package Queue;

import java.util.Scanner;

public class RoundRobin {

    private static Scanner scanner = new Scanner(System.in);
    private static QueueGeneric<Job> queue = new QueueGeneric<Job>();
    private static int quantum;

    public static void main(String[] args){
        setJobs();
        runScheduler();
    }//End method main

    //get information about the jobs runnig in queue
    public static void setJobs(){
        Job job;
        int jobNum, cpuTime;

        System.out.println("Enter the jobs number to assing on queue:");
        jobNum = scanner.nextInt();
        System.out.println("Enter the size of each time quantum processor:");
        quantum = scanner.nextInt();
        System.out.println();

        for(int i = 0; i < jobNum; i++){
            String message = STR."Enter the processor time of job \{i}:";
            System.out.println(message);
            cpuTime = scanner.nextInt();
            job = new Job(i, cpuTime);
            queue.enqueue(job);
        }
        System.out.println();


    }//End setJobs method

    //simuates the round-robin scheduler
    public static void runScheduler(){
        Job job;
        int cpuTime, accumulatedCpuTime = 0;

        while(!queue.empty()){
            job = queue.dequeue();
            cpuTime = job.getCpuTime();

            if(cpuTime-quantum > 0){
                accumulatedCpuTime += quantum;
                job.setCpuTime(cpuTime-quantum);
                queue.enqueue(job);
            }else{
                String message = STR."Job with id \{job.getJobNum()} has been finised on time \{accumulatedCpuTime}";
                accumulatedCpuTime += quantum;
                System.out.println(message );
            }

        }//End loop

    }//End run scheduler method


}//End round robin test class
