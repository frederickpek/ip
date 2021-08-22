package duke.command;

import java.io.*;
import java.util.*;
import duke.util.UI;
import duke.util.Storage;
import duke.task.Task;
import duke.task.TaskList;

/**
 * The abstract Command class encapsulates information
 * and methods pertaining to user commands in Duke.
 *
 * @author Frederick Pek
 * @version CS2103 AY21/22 Sem 1 iP
 */
public abstract class Command {
<<<<<<< HEAD
    /**
     * Executes this Command and prints appropriate responses.
     *
     * @param taskList the TaskList object of Duke.
     * @param ui the UI handler of Duke.
     * @param storage theStorage handler of Duke.
     * @throws IOException On failed loading of Storage files.
     */
    public abstract void execute(TaskList taskList, UI ui, Storage storage) throws IOException;

    /**
     * Returns true if this is an instance of an ExitCommand.
     *
     * @return Returns true if this is an instance of an ExitCommand.
     */
=======
    public abstract void execute(TaskList tasks, UI ui, Storage storage) throws IOException;

>>>>>>> branch-A-CodingStandard
    public boolean isExit() {
        return false;
    }
}
