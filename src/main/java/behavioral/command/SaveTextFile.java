package behavioral.command;

public class SaveTextFile implements TextFileOperation {

    @Override
    public String execute(TextFile tf) {
        // may be decorating
        return tf.save();
    }
}
