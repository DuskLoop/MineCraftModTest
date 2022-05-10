
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.danielsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.danielsmod.block.DanielsBlockBlock;
import net.mcreator.danielsmod.DanielsmodMod;

public class DanielsmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DanielsmodMod.MODID);
	public static final RegistryObject<Block> DANIELS_BLOCK = REGISTRY.register("daniels_block", () -> new DanielsBlockBlock());
}
