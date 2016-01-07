package ga.dore.overcastreport.client.capture;


import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class SnapshotCapture {
    private static final Minecraft minecraft = Minecraft.getMinecraft();
    private static final int width = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private static final int height = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    public static void snapScreen(ICommandSender sender) throws Exception {
        Rectangle screenRect = new Rectangle(width, height);
        BufferedImage image = new Robot().createScreenCapture(screenRect);
        sender.addChatMessage(new ChatComponentText("Picture taken"));
        ImageIO.write(image, "png", new File("/home/mayatta65/.minecraft/snaps/test.png"));


    }
}
