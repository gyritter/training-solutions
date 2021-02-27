package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos= new ArrayList<>();

    public List<Todo> getTodos() {
        return todos;
    }

    public  int getNumberOfItemsLeft() {

       int count=0;
       for(Todo x:todos){
           if(x.getState().equals(State.NON_COMPLETED)){
               count++;
           }
       }
       return count;
   }

    public List <String> getMostImportantTodosText() {
       List<String>result= new ArrayList<>();
        int prior = getMaxPrior();
        for(Todo x:todos) {
            if (x.getPriority()== prior) {
                result.add(x.getText());
            }
        }
        return result;

    }

    private int getMaxPrior() {
        int prior=todos.get(0).getPriority();
        for(Todo x:todos) {
            if (x.getPriority() < prior) {
                prior = x.getPriority();
            }
        }
        return prior;
    }

    public void deleteCompleted(){
       for(int i=0; i<todos.size(); i++) {
           if (todos.get(i).getState().equals(State.COMPLETED)) {
               todos.remove(i);
           }
       }
       }

       public void addTodo(Todo todo){
       todos.add(todo);

       }
}
