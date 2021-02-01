package collectionsqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    public Queue<Job> addJob(Job... jobs){
        PriorityQueue<Job> sortedJobs= new PriorityQueue<>();
        for(Job j:jobs){
            sortedJobs.add(j);
        }
        return sortedJobs;
    }

    public Job dispatchNextJob(Queue<Job> jobs){
        if(jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.peek();
    }
}
