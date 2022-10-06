package practice;

import java.time.LocalDate;
import java.util.Comparator;

public class Task implements Comparator<Task> {

	/** 日付 */
	private LocalDate date;
	/** タスク */
	private String task;

	public Task() {
	}

	public Task(LocalDate date, String task) {
		this.date = date;
		this.task = task;
	}

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

	@Override
	public String toString() {
		return "Task [date=" + date + ", task=" + task + "]";
	}

	@Override
	public int compare(Task o1, Task o2) {
		if (o1.date.isBefore(o2.date)) {
			return -1;
		} else if (o1.date.isAfter(o2.date)) {
			return 1;
		}
		return 0;
	}

}
