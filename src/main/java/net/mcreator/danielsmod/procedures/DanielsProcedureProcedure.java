package net.mcreator.danielsmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.danielsmod.DanielsmodMod;

public class DanielsProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DanielsmodMod.LOGGER.info("Procedure run");
		if (world instanceof ServerLevel _level) {
			for (int i = 0; i < 10; i++) {
				DanielsmodMod.LOGGER.info("Loop" + i + "lol");

				Entity entityToSpawn = new Cow(EntityType.COW, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
