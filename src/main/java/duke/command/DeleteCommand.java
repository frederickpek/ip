package duke.command;

import java.io.*;
import java.util.*;
import duke.util.UI;
import duke.util.Storage;
import duke.task.Task;
import duke.task.TaskList;

public class DeleteCommand extends Command {
	private int index;

	public DeleteCommand(int index) {
		this.index = index;
	}

	public void execute(TaskList taskList, UI ui, Storage storage) throws IOException {
		ui.add("Noted. I've removed this task:");
		ui.add("  " + taskList.get(this.index));
		taskList.delete(index);
		ui.add(String.format("Now you have %d task(s) in the list.", taskList.size()));
		ui.print();
		storage.saveTasks(taskList.getTasks());
	}
}
