package main.java.command;

import java.util.List;

import main.java.exception.InvalidArgumentException;
import main.java.misc.Ui;
import main.java.task.TaskList;


public class DoneCommand extends Command {
    public DoneCommand(List<String> input) {
        super(input);
    }

    @Override
    public void run(TaskList taskList) throws InvalidArgumentException {
        int index = Integer.parseInt(input.get(1));
        taskList.finishTask(index);
        Ui.done(taskList.getTask(index).toString());
    }
}
