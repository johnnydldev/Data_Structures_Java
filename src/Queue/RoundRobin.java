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
        double average = 0;

        while(!queue.empty()){
            job = queue.dequeue();
            cpuTime = job.getCpuTimeLess();

            if(cpuTime-quantum > 0){
                accumulatedCpuTime += quantum;
                job.setCpuTimeLess(cpuTime-quantum);
                queue.enqueue(job);
            }else{
                average = (double) accumulatedCpuTime /job.getCpuTimeInitial();
                String message = STR."Job with id \{job.getJobNum()} has been finised on time \{accumulatedCpuTime}";
                String messageComplement = STR."\twith a wait time average of: \{average}";
                accumulatedCpuTime += quantum;
                System.out.println(message+messageComplement);
            }

        }//End loop

    }//End run scheduler method


}//End round robin test class
