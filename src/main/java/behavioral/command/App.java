package behavioral.command;

public class App {

    public static void main(String[] args) {
        var executor = new TextFileExecutor();
        executor.setTextFileOperations(TextOperation.OPEN, new OpenTextFile());
        executor.setTextFileOperations(TextOperation.SAVE, new SaveTextFile());

        System.out.println(executor.execute(TextOperation.OPEN, new TextFile("file1.txt")));
        System.out.println(executor.execute(TextOperation.SAVE, new TextFile("file2.txt")));

        new OpenTextFile().execute(new TextFile("file1.txt"));
    }

    /*
    A command is an object whose role is to store all the information required for executing an action,
    including the method to call, the method arguments, and the object (known as the receiver) that implements the method.

    A receiver is an object that performs a set of cohesive actions.
    It's the component that performs the actual action when the command's execute() method is called.

    An invoker is an object that knows how to execute a given command but doesn't know how the command has been implemented.
    It only knows the command's interface.

    The TextFileExecutor class is just a thin layer of abstraction that decouples the command objects from their consumers
    and calls the method encapsulated within the TextFileOperation command objects.
    The TextFile instance is the receiver.
    The TextFileOperation interface defines the command objects' API,
    and the two implementations, OpenTextFileOperation and SaveTextFileOperation, perform the concrete actions.

     */
}
