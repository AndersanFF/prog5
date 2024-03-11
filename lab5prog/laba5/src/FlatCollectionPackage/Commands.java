package FlatCollectionPackage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import CommandsPackage.Clear;
import CommandsPackage.Execute_script;
import CommandsPackage.Exit;
import CommandsPackage.Help;
import CommandsPackage.History;
import CommandsPackage.Info;
import CommandsPackage.Remove_greater;
import CommandsPackage.Save;
import CommandsPackage.Show;
import CommandsPackage.Update_id;

public class Commands implements CommandInterface{
    Help help = new Help();
    Info info = new Info();
    Clear clear = new Clear();
    Execute_script execute_script = new Execute_script();
    Exit exit = new Exit();
    History history = new History();
    Remove_greater remove_greater = new Remove_greater();
    Save save = new Save();
    Show show = new Show();
    Update_id update_id = new Update_id();
    Scanner console = new Scanner(System.in);



    private Map<String, Object> commands = new LinkedHashMap<String, Object>(){{
        put("help", help);
        put("info", info);
        put("clear", clear);
        put("execute script", execute_script);
        put("exit", exit);
        put("history", history);
        put("remove greater", remove_greater);
        put("save", save);
        put("show", show);
        put("update id", update_id);
    }};
    @Override
    public Object getObject(String command){
        return commands.get(command);
    }

public void consoleReader(){
String name = console.nextLine();
boolean a = true;
while (a) {
    if (commands.get(name).equals(null)){
    System.out.println("Введите заново");
    name = console.nextLine();
    }
    else{
        a = false;
        try{
        Object popa = commands.get(name);
        Method method = commands.get(name).getClass().getDeclaredMethod("invoker");
        method.setAccessible(true);
        method.invoke(popa);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
}
}

