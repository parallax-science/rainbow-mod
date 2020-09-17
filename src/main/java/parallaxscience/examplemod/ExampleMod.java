package parallaxscience.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * The Main Class for the Mod
 * This is where the name and id and mod are declared, as where as everything is initialized
 * @author CapdinCrando
 */
@SuppressWarnings("unused")
@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION, acceptedMinecraftVersions = ExampleMod.MC_VERSION)
public class ExampleMod
{
	/**
	 * The MODID is the unique id for the mod
	 */
	public static final String MODID = "examplemod";

	/**
	 * The user friendly name of the mod
	 */
	static final String NAME = "Example Mod";

	/**
	 * The mod version
	 * Denoted by major.minor.patch.build
	 */
	static final String VERSION = "0.1.0";

	/**
	 * The version of Minecraft that this mod is compatible with
	 */
	static final String MC_VERSION = "[1.12.2]";

	/**
	 * The mod's logger instance
	 * Used to log messages to the console
	 * Given by the FMLPreInitializationEvent
	 * @see Logger
	 */
	public static Logger logger;

	/**
	 * Called on Forge startup
	 * Used primarily for event registration and config management
	 * @param event FMLPreInitializationEvent
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
	}

	/**
	 * Called after the preInit phase
	 * The main function for mod code
	 * This is where all blocks, items, etc are registered
	 * @param event FMLInitializationEvent
	 */
	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	/**
	 * Called after the init phase
	 * This is primarily used for mod compatibility
	 * @param event FMLPostInitializationEvent
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
