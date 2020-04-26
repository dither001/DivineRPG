package divinerpg.objects.entities.entity.twilight;

import divinerpg.objects.entities.entity.EntityDivineRPGMob;
import divinerpg.registry.DRPGLootTables;
import divinerpg.registry.ModSounds;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntitySoulSpider extends EntityDivineRPGMob {

    public EntitySoulSpider(World worldIn) {
        super(worldIn);
        this.setSize(0.3F, 0.5F);
    }

    @Override
    public float getEyeHeight() {
        return 0.35F;
    }


    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        addAttackingAI();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.ticksExisted > 600 && !this.world.isRemote)
            this.setDead();
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.GROWL;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.GROWL_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.GROWL_HURT;
    }

    @Override
    protected ResourceLocation getLootTable() {
        return DRPGLootTables.ENTITIES_SOUL_SPIDER;
    }
}
