package Prompt.cmd;


public class Print implements Cmd{
    @Override
    public void start(String args) {
        System.out.println(args);
    }
}
