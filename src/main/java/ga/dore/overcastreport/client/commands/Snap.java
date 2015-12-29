package ga.dore.overcastreport.client.commands;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class Snap implements ICommand {

    public List aliases = new ArrayList();

    public Snap() {
        aliases.add("snap");
        aliases.add("screenshot");
    }
    public String getName() {
        return "record";
    }

    public List getAliases() {
        return aliases;
    }

    public void execute(ICommandSender sender, String[] arg) {
        sender.addChatMessage(new ChatComponentText("tested."));
    }

    public boolean isUsernameIndex(String[] args, int num) {
        return false;
    }

    public String getCommandUsage(ICommandSender sender) {
        sender.addChatMessage(new ChatComponentText("/record"));
        return "";
    }

    public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return new ArrayList();
    }

    public boolean canCommandSenderUse(ICommandSender sender) {return true;}

    public int compareTo(Object object) {
        return 0;
    }

}