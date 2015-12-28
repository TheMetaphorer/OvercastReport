package ga.dore.overcastreport;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=OvercastReport.MODID, name=OvercastReport.MODNAME, version=OvercastReport.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class OvercastReport //Start the class Declaration
{
    //Set the ID of the mod (Should be lower case).
    public static final String MODID = "overcastreport";
    //Set the "Name" of the mod.
    public static final String MODNAME = "Overcast Report";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @Instance(value = OvercastReport.MODID) //Tell Forge what instance to use.
    public static OvercastReport instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}