package practice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {

		LocalDate d1 = LocalDate.of(2021, 10, 21);
		LocalDate d2 = LocalDate.of(2021, 9, 15);
		LocalDate d3 = LocalDate.of(2021, 12, 4);
		LocalDate d4 = LocalDate.of(2021, 8, 10);
		LocalDate d5 = LocalDate.of(2021, 11, 9);

		List<Task> taskList = new LinkedList<Task>();
		taskList.add(new Task(d1, "牛乳を買う。"));
		taskList.add(new Task(d2, "〇〇社面談。"));
		taskList.add(new Task(d3, "手帳を買う。"));
		taskList.add(new Task(d4, "散髪に行く。"));
		taskList.add(new Task(d5, "スクールの課題を解く。"));

		Collections.sort(taskList);
		for (Task task : taskList) {
			System.out.println(task.getDate() + ":" + task.getTask());
		}

//		Map<LocalDate, String> taskLists = new HashMap<LocalDate, String>();
//		taskLists.put(d1, "牛乳を買う。");
//		taskLists.put(d2, "〇〇社面談。");
//		taskLists.put(d3, "手帳を買う。");
//		taskLists.put(d4, "散髪に行く。");
//		taskLists.put(d5, "スクールの課題を解く。");

//		List<LocalDate> dList = new ArrayList<LocalDate>(taskList.keySet());
//		dList.sort((s1, s2) -> s1.compareTo(s2));
//		for (LocalDate d : dList) {
//			System.out.println(d + ":" + taskList.get(d));
//		}

//		for (Map.Entry<LocalDate, String> task : taskLists.entrySet()) {
//			System.out.println(task.getKey() + ":" + task.getValue());
//		}
	}

}
