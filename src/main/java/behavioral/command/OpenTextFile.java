package behavioral.command;

public class OpenTextFile implements TextFileOperation {

    @Override
    public String execute(TextFile tf) {
        return tf.open();
    }
}
