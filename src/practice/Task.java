package practice;

import java.time.LocalDate;

public class Task {

	/** 日付 */
	private LocalDate date;
	/** タスク */
	private String task;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
