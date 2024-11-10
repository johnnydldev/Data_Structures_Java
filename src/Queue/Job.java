package Queue;

public class Job {

    private int jobNum;
    private int cpuTimeInitial;
    private int cpuTimeLess;

    public Job(int jobNUm, int cpuTime){
        this.jobNum = jobNUm;
        this.cpuTimeInitial = cpuTime;
        this.cpuTimeLess = cpuTime;

    }//End constructor

    public int getJobNum(){
        return this.jobNum;
    }//End get value of jobNum

    public int getCpuTimeLess(){
        return this.cpuTimeLess;
    }//End get value of cpuTime

    public void setCpuTimeLess(int cpuTime){
        this.cpuTimeLess = cpuTime;
    }//End set value of cpuTime

    public int getCpuTimeInitial(){
        return this.cpuTimeInitial;
    }//End get value of cpuTime

}//End class
