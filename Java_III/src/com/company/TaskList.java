package com.company;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> myboard =new ArrayList();

    public void addTask(String task){
        myboard.add(task);
    }

    public void addTaskbyPosition(int position, String task){
        if(position < myboard.size()){
            myboard.add(position, task);
        }
    }

    public void printTasks(){
        if(!myboard.isEmpty()){
            System.out.println("Списов задач: ");
            for (int j=0; j < myboard.size(); j++){
                System.out.println(j+"] "+ myboard.get(j));
            }
        }else {
            System.out.println("Список задач пуст...");
        }
    }

    public void changeTask(int position, String task){
        if (position < myboard.size()){
            myboard.set(position, task);
        }
    }

    public void removeTask(String task){
        myboard.remove(task);
    }

    public int getTaskPriority(String task){
        return myboard.indexOf(task);
    }
}
