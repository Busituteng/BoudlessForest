package net.mcreator.boundlessforest.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.boundlessforest.ElementsBoundlessForest;

@ElementsBoundlessForest.ModElement.Tag
public class ProcedureForestbatEntityDies extends ElementsBoundlessForest.ModElement {
	public ProcedureForestbatEntityDies(ElementsBoundlessForest instance) {
		super(instance, 9);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u6211\u4ED6\u5988\u76F4\u547C\u9AD8\u901F\uFF01"));
		}
	}
}
