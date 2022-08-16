
package net.mcreator.boundlessforest.item;

import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.boundlessforest.world.WorldBoundlessforestdimension;
import net.mcreator.boundlessforest.creativetab.TabBF;

public class ItemBoundlessforestdimension extends Item {
	@GameRegistry.ObjectHolder("boundlessforest:boundlessforestdimension")
	public static final Item block = null;
	public ItemBoundlessforestdimension() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(TabBF.tab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		pos = pos.offset(facing);
		ItemStack itemstack = entity.getHeldItem(hand);
		if (!entity.canPlayerEdit(pos, facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			if (world.isAirBlock(pos))
				WorldBoundlessforestdimension.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity);
			return EnumActionResult.SUCCESS;
		}
	}
}
