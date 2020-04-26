package divinerpg.objects.entities.entity.arcana;

import divinerpg.objects.entities.entity.EntityDivineRPGMob;
import divinerpg.registry.DRPGLootTables;
import divinerpg.registry.ModSounds;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDungeonDemon extends EntityDivineRPGMob {

    public EntityDungeonDemon(World world) {
        super(world);
        this.setSize(0.6F, 2.15F);
    }

    @Override
    public float getEyeHeight() {
        return 1.8F;
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        addAttackingAI();
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.DUNGEON_PRISONER;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource s) {
        return ModSounds.DUNGEON_PRISONER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.DUNGEON_PRISONER_HURT;
    }

    @Override
    protected ResourceLocation getLootTable() {
        return DRPGLootTables.ENTITIES_DUNGEON_DEMON;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY < 40.0D && super.getCanSpawnHere();
    }
}
