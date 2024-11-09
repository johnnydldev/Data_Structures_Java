package Queue;

public class Job {

    private int jobNum;
    private int cpuTime;

    public Job(int jobNUm, int cpuTime){
        this.jobNum = jobNUm;
        this.cpuTime = cpuTime;
    }//End constructor

    public int getJobNum(){
        return this.jobNum;
    }//End get value of jobNum

    public int getCpuTime(){
        return this.cpuTime;
    }//End get value of cpuTime

    public void setCpuTime(int cpuTime){
        this.cpuTime = cpuTime;
    }//End set value of cpuTime


}//End class
