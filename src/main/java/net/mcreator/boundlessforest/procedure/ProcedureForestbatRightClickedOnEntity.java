package net.mcreator.boundlessforest.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.boundlessforest.ElementsBoundlessForest;

@ElementsBoundlessForest.ModElement.Tag
public class ProcedureForestbatRightClickedOnEntity extends ElementsBoundlessForest.ModElement {
	public ProcedureForestbatRightClickedOnEntity(ElementsBoundlessForest instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString("\u5C41\u773C\u8981\u5F00\u59CB\u52A0\u901F\u4E86\uFF01"));
		}
	}
}
