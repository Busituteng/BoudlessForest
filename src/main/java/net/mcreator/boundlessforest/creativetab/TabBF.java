
package net.mcreator.boundlessforest.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.boundlessforest.item.ItemLogo;
import net.mcreator.boundlessforest.ElementsBoundlessForest;

@ElementsBoundlessForest.ModElement.Tag
public class TabBF extends ElementsBoundlessForest.ModElement {
	public TabBF(ElementsBoundlessForest instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabbf") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLogo.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
