package Assignment.Assignment2.model;

/**
 * 职务类
 */
public class Job {
    private String jobId;  //职务编号
    private String jobName;  //职务名称

    //传入全部参数构造方法
    public Job(String jobName, String jobId) {
        this.setJobName(jobName);
        this.setJobId(jobId);
    }

    //getter/setter方法
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
