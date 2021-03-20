package com.leviathanstudio.craftstudio.common.animation.simpleImpl;

import com.leviathanstudio.craftstudio.CraftStudioApi;
import com.leviathanstudio.craftstudio.common.animation.AnimationHandler;
import com.leviathanstudio.craftstudio.common.animation.IAnimated;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.world.World;

/**
 * An abstract class that represent an animated entity. You can extends it or
 * use it as a model to create your own animated entity.
 *
 * @author Timmypote
 * @since 0.3.0
 */
public abstract class AnimatedEntity extends CreatureEntity implements IAnimated {
    /**
     * The animation handler of this type of entity.
     */
    // It should be different for every entity class, unless child classes have
    // the same models.
    // You should declare a new one in your extended classes.
    protected static AnimationHandler animHandler = CraftStudioApi.getNewAnimationHandler(AnimatedEntity.class);

    // Here you should add all the needed animations in the animationHandler.
    static {
        //AnimatedEntity.animHandler.addAnim("yourModId", "yourAnimation", "yourModel", false);
    }

    protected AnimatedEntity(EntityType<? extends CreatureEntity> entityType, World world) {
        super(entityType, world);
    }

    /**
     * The constructor of the entity.
     */


    // You must call super.onLivingUpdate(), in your entity, or call the
    // animationsUpdate() method like here.
    @Override
    public void tick() {
        super.tick();
        this.getAnimationHandler().animationsUpdate(this);
    }

    @Override
    public <T extends IAnimated> AnimationHandler<T> getAnimationHandler() {
        // Be careful to return the right animation handler.
        return AnimatedEntity.animHandler;
    }

    @Override
    public EntitySize getDimensions(Pose p_213305_1_) {
        return super.getDimensions(p_213305_1_);
    }


    @Override
    public boolean isWorldRemote() {
        return this.getEntity().getCommandSenderWorld().isClientSide;
    }
}
