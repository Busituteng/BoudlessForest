
package net.mcreator.boundlessforest.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityCreature;

import net.mcreator.boundlessforest.entity.EntityForestbat;
import net.mcreator.boundlessforest.ElementsBoundlessForest;

import java.util.Random;

@ElementsBoundlessForest.ModElement.Tag
public class BiomeBoundlessForest extends ElementsBoundlessForest.ModElement {
	@GameRegistry.ObjectHolder("boundlessforest:boundlessforest")
	public static final BiomeGenCustom biome = null;
	public BiomeBoundlessForest(ElementsBoundlessForest instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Boundless Forest").setRainfall(0.2F).setBaseHeight(0.2F).setWaterColor(-14321523)
					.setHeightVariation(0.15F).setTemperature(0.4F));
			setRegistryName("boundlessforest");
			topBlock = Blocks.GRASS.getDefaultState();
			fillerBlock = Blocks.DIRT.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 5;
			decorator.flowersPerChunk = 2;
			decorator.grassPerChunk = 7;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 1;
			decorator.bigMushroomsPerChunk = 1;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityCreature.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntityForestbat.EntityCustom.class, 40, 1, 5));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -7688167;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -7688167;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -5526185;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return BIG_TREE_FEATURE;
		}
	}
}
