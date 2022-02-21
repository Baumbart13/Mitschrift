package htl;

import java.util.Stack;

public class CommandRecorder {
    private Stack<Command> undoStack = new Stack<Command>();
    private Stack<Command> redoStack = new Stack<Command>();

    public void execute(Command cmd){
        cmd.execute();
        undoStack.push(cmd);
        redoStack.clear();
    }

    public void undo(){
        var cmd = undoStack.pop();
        redoStack.push(cmd);
        cmd = undoStack.peek();
        cmd.execute();
    }

    public void redo(){
        var cmd = redoStack.pop();
        cmd.execute();
        undoStack.push(cmd);
    }

    public boolean canUndo(){
        return undoStack.size() > 1;
    }

    public boolean canRedo(){
        return redoStack.size() > 0;
    }
}
