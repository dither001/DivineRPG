package divinerpg.entities.goal;

import net.minecraft.entity.EntityPredicate;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.TargetGoal;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class RevengeGoal extends TargetGoal {
    private static final EntityPredicate field_220795_a = (new EntityPredicate()).setLineOfSiteRequired().setUseInvisibilityCheck();
    private final Class<?>[] excludedReinforcementTypes;
    private boolean entityCallsForHelp;
    private int revengeTimerOld;
    private Class<?>[] field_220797_i;

    public RevengeGoal(MobEntity creatureIn, Class<?>... attackableClasses) {
        super(creatureIn, true);
        this.excludedReinforcementTypes = attackableClasses;
        this.setMutexFlags(EnumSet.of(Goal.Flag.TARGET));
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute() {
        int i = this.goalOwner.getRevengeTimer();
        LivingEntity livingentity = this.goalOwner.getRevengeTarget();
        if (i != this.revengeTimerOld && livingentity != null) {
            for (Class<?> oclass : this.excludedReinforcementTypes) {
                if (oclass.isAssignableFrom(livingentity.getClass())) {
                    return false;
                }
            }

            return this.isSuitableTarget(livingentity, field_220795_a);
        } else {
            return false;
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        this.goalOwner.setAttackTarget(this.goalOwner.getRevengeTarget());
        this.target = this.goalOwner.getAttackTarget();
        this.revengeTimerOld = this.goalOwner.getRevengeTimer();
        this.unseenMemoryTicks = 300;
        if (this.entityCallsForHelp) {
            this.alertOthers();
        }

        super.startExecuting();
    }

    protected void alertOthers() {
        double d0 = this.getTargetDistance();
        List<MobEntity> list = this.goalOwner.world.func_225317_b(this.goalOwner.getClass(), (new AxisAlignedBB(this.goalOwner.serverPosX, this.goalOwner.serverPosY, this.goalOwner.serverPosZ, this.goalOwner.serverPosX + 1.0D, this.goalOwner.serverPosY + 1.0D, this.goalOwner.serverPosZ + 1.0D)).grow(d0, 10.0D, d0));
        Iterator iterator = list.iterator();

        while (true) {
            MobEntity mobentity;
            while (true) {
                if (!iterator.hasNext()) {
                    return;
                }

                mobentity = (MobEntity) iterator.next();
                if (this.goalOwner != mobentity && mobentity.getAttackTarget() == null && (!(this.goalOwner instanceof TameableEntity) || ((TameableEntity) this.goalOwner).getOwner() == ((TameableEntity) mobentity).getOwner()) && !mobentity.isOnSameTeam(this.goalOwner.getRevengeTarget())) {
                    if (this.field_220797_i == null) {
                        break;
                    }

                    boolean flag = false;

                    for (Class<?> oclass : this.field_220797_i) {
                        if (mobentity.getClass() == oclass) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag) {
                        break;
                    }
                }
            }

            this.setAttackTarget(mobentity, this.goalOwner.getRevengeTarget());
        }
    }

    protected void setAttackTarget(MobEntity mobIn, LivingEntity targetIn) {
        mobIn.setAttackTarget(targetIn);
    }
}