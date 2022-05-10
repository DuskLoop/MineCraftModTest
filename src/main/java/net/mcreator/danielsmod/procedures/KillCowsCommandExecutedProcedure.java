package net.mcreator.danielsmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.danielsmod.DanielsmodMod;

import java.util.Comparator;

public class KillCowsCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (100); index0++) {
			DanielsmodMod.LOGGER.info("Modified killcows Succesfully called");
			// ((Entity) world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().findFirst().orElse(null)).hurt(DamageSource.GENERIC, 100);
			world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).forEach(cow -> {
				cow.hurt(DamageSource.GENERIC, 100);	
			});
		}
	}
}
