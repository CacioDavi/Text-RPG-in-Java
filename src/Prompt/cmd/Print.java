package Prompt.cmd;

public class Print implements Cmd{
    @Override
    public void executar(String... text) {
        System.out.println(text);
    }
}
