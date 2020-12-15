package interfaces;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable{

    private List<String> tasks =new ArrayList();

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep(){
        if (tasks.size()>0){
            tasks.remove(tasks.size()-1);
        }
        if (tasks.size()>0) return true;
        return false;
    }

    @Override
    public void run() {
        //if(tasks == null  || tasks.size()<1){
        //    throw new IllegalArgumentException("The array is empty!");
        //}
        do{
        } while (nextStep());
    }
}
