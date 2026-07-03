package Prompt;
import java.lang.reflect.Method;
import java.util.Arrays;

import Types.Args;

public class Prompt {

    public static void SendPrompt(String[] prompt) {
        try{
            Class<?> CmdClass = Class.forName("Prompt.cmd." + prompt[0]);
            Method CmdExecution = CmdClass.getMethod("start", String.class);
            Object CmdObjInstance = CmdClass.getDeclaredConstructor().newInstance();

            String Args = Args.toArgs(prompt);

            CmdExecution.invoke(CmdObjInstance, Arrays.toString(prompt).replace("[" + prompt[0], "").replace("]", "").replace(",", ""));
        } catch (Exception exception) {
            System.out.println("Comando não encontrado!");
            System.out.println("Error:\n" + exception +"\n\n");
        }
    }
}