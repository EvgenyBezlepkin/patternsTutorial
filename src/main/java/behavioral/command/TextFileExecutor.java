package behavioral.command;

import java.util.HashMap;

public class TextFileExecutor {

    private final HashMap<TextOperation, TextFileOperation> operationsCash = new HashMap<>();

    public void setTextFileOperations(TextOperation to, TextFileOperation tfo) {
        operationsCash.putIfAbsent(to, tfo);
    }

    public String execute(TextOperation to, TextFile file) {
        try {
            return operationsCash.get(to).execute(file);
        } catch (Exception e) {
            throw new IllegalStateException("no command registered for " + to);
        }
    }

}
