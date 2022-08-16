package net.mcreator.boundlessforest.procedure;

import net.minecraftforge.fml.common.FMLCommonHandler;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.server.MinecraftServer;

import net.mcreator.boundlessforest.ElementsBoundlessForest;

@ElementsBoundlessForest.ModElement.Tag
public class ProcedureForestbatEntityIsHurt extends ElementsBoundlessForest.ModElement {
	public ProcedureForestbatEntityIsHurt(ElementsBoundlessForest instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new TextComponentString(
						"\u4E0D\u662F\u559C\u6B22\u52A0\u52A0\u901F\u706B\u628A\u5417\uFF1F\u628A\u52A0\u901F\u706B\u628A\u63D2\u8FDB\u4F60\u5C41\u773C\u91CC\uFF0C\u7ED9\u4F60\u597D\u597D\u52A0\u4E2A\u901F\uFF01"));
		}
	}
}
