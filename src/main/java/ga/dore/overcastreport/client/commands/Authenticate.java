package ga.dore.overcastreport.client.commands;


import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Authenticate implements ICommand {
    public List<String> aliases = new ArrayList<>();
    public final Minecraft minecraft = Minecraft.getMinecraft();
    public File configFile;

    public String getName() { return "authenticate"; }

    public List<String> getAliases() {
        return aliases;
    }

    public void execute(ICommandSender sender, String[] args) {
        if (!(args.length == 2)) {
            getCommandUsage(sender);
            return;
        }
        if (System.getProperty("os.name").contains("Windows")) {
            configFile = new File(System.getenv("APPDATA"), ".mincraft/ocrcfg/auth.properties");
        } else if (System.getProperty("os.name").contains("Linux")) {
            configFile = new File(System.getProperty("user.home"), ".minecraft/ocrcfg/auth.properties");
        } else {
            configFile = new File(System.getProperty("user.home"), "/Library/Application\\ Support/minecraft/ocrcfg/auth.properties");
        }
        try {
            PrintWriter writer = new PrintWriter(configFile);
            writer.println("email=" + args[0]);
            writer.println("password=" + args[1]);
            writer.close();
        } catch (FileNotFoundException e) {
            sender.addChatMessage(new ChatComponentText("Couldn't create config file."));
        }


    }

    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    public String getCommandUsage(ICommandSender sender) {
        sender.addChatMessage(new ChatComponentText("/auth <username>, <password>"));
        return "";
    }

    public int compareTo(Object object) { return 0; }

    public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {return new ArrayList<>();}

    public boolean canCommandSenderUse(ICommandSender sender) { return true; }

}
