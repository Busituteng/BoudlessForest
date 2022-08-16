package net.mcreator.boundlessforest.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.boundlessforest.ElementsBoundlessForest;

@ElementsBoundlessForest.ModElement.Tag
public class ProcedureForestbatItIsStruckByLightning extends ElementsBoundlessForest.ModElement {
	public ProcedureForestbatItIsStruckByLightning(ElementsBoundlessForest instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList()
						.sendMessage(new TextComponentString("\u4E0A\u5E1D\u624D\u6709\u601C\u60AF\u4E4B\u5FC3\uFF0C\u6211\u6CA1\u6709\uFF01"));
		}
	}
}
