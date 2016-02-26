package simpleDS.interaction;

import simpleDS.util.StringUtil;
import java.util.HashMap;
import java.util.Scanner;

public class SimpleUser extends SimpleUserSimulator {
    Scanner stdin;

    public SimpleUser(HashMap<String,String> configurations) {
        super(configurations);
        stdin = new Scanner(System.in);
    }

    private void loadUserResponses(String usrResponsesFile, String slotsFile) {}

    public void resetUserGoal() {}

    public synchronized String getAction(String action_sys_key, String action_sys_val) {
        System.out.println("Your turn (action): ");
        String response = stdin.nextLine();
        return response;
    }

    public synchronized boolean validConfirmation(String dialAct) {
        System.out.println("Confirmation needed: " + dialAct);
        String response = stdin.nextLine();
        return response.toLowerCase().equals("yes");
    }

    public String getAction_Unfolded(String action_usr) {
        return StringUtil.getExpandedDialAct(action_usr, usrGoal);
    }

    public String getResponse(String action_usr) {
        System.out.print("Your turn: ");
        return this.stdin.nextLine();
    }
}

