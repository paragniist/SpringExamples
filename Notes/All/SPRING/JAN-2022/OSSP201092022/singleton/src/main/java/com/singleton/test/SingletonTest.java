package com.singleton.test;

import com.singleton.beans.JobScheduler;
import com.singleton.beans.ToDoManager;

public class SingletonTest {
	public static void main(String[] args) {
		ToDoManager toDoManager = new ToDoManager();
		toDoManager.manage();

		JobScheduler jobScheduler = new JobScheduler();
		jobScheduler.execute();
	}
}
