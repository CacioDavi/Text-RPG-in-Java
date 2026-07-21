package Prompt;
import java.lang.reflect.Method;

import Types.Args;

public class Prompt {

    public static void SendPrompt(String[] prompt) {
        try{
            Class<?> CmdClass = Class.forName("Prompt.cmd." + prompt[0]);
            Method CmdExecution = CmdClass.getMethod("start", String.class);
            Object CmdObjInstance = CmdClass.getDeclaredConstructor().newInstance();

            String args = Args.toArgs(prompt);

            CmdExecution.invoke(CmdObjInstance, args);
            
        } catch (Exception exception) {
            System.out.println("Comando não encontrado!");
            System.out.println("Error:\n" + exception +"\n\n");

            if (exception instanceof java.lang.reflect.InvocationTargetException) {
                ((java.lang.reflect.InvocationTargetException) exception)
                .getCause()
                .printStackTrace();
    }
        }
    }
}