package com.leviathanstudio.craftstudio.common.animation.simpleImpl;

import com.leviathanstudio.craftstudio.CraftStudioApi;
import com.leviathanstudio.craftstudio.common.animation.AnimationHandler;
import com.leviathanstudio.craftstudio.common.animation.IAnimated;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

/**
 * An abstract class that represent a animated TileEntity. You should extends it
 * and not create your own, or be careful to implement all the methods of this
 * class.
 *
 * @author Timmypote
 * @since 0.3.0
 */
public abstract class AnimatedTileEntity extends TileEntity implements IAnimated, ITickableTileEntity {
    /**
     * The animation handler of this type of tile entity.
     */
    // It should be different for every entity class, unless child classes have
    // the same models.
    // You should declare a new one in your extended classes.
    protected static AnimationHandler animHandler = CraftStudioApi.getNewAnimationHandler(AnimatedTileEntity.class);

    // Here you should add all the needed animations in the animationHandler.
    static {
        //AnimatedTileEntity.animHandler.addAnim("yourModId", "yourAnimation", "yourModel", false);
    }

    public AnimatedTileEntity(TileEntityType<?> tileEntityType) {
        super(tileEntityType);
    }

    @Override
    public void tick() {
        this.getAnimationHandler().animationsUpdate(this);
    }

    /**
     * The constructor of the tile entity.
     */


    // You must call super.update() at the beginning of your update() method,
    // or call the animationsUpdate() method like here.
    @Override
    public <T extends IAnimated> AnimationHandler<T> getAnimationHandler() {
        // Be careful to return the right animation handler.
        return AnimatedTileEntity.animHandler;
    }

    @Override
    public int getDimension() {
        return this;
    }

    @Override
    public double getX() {
        return this.worldPosition.getX();
    }

    @Override
    public double getY() {
        return this.worldPosition.getY();
    }

    @Override
    public double getZ() {
        return this.worldPosition.getZ();
    }

    @Override
    public boolean isWorldRemote() {
        return this.getTileEntity().getLevel().isClientSide();
    }

    // Here to prevent bugs on the integrated server.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.worldPosition.getX();
        result = prime * result + this.worldPosition.getY();
        result = prime * result + this.worldPosition.getZ();
        return result;
    }

    // Here to prevent bugs on the integrated server.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        AnimatedTileEntity other = (AnimatedTileEntity) obj;
        if (this.worldPosition.getX() != other.worldPosition.getX())
            return false;
        if (this.worldPosition.getY() != other.worldPosition.getY())
            return false;
        if (this.worldPosition.getZ() != other.worldPosition.getZ())
            return false;
        return true;
    }

}
