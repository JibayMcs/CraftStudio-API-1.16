package com.leviathanstudio.craftstudio.client.model;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CSModelRenderer extends ModelRenderer {

    public final ObjectList<ModelRenderer.ModelBox> cubes = new ObjectArrayList<>();
    public final ObjectList<ModelRenderer> children = new ObjectArrayList<>();

    public CSModelRenderer(Model p_i1173_1_) {
        super(p_i1173_1_);
    }

    public CSModelRenderer(Model p_i46358_1_, int p_i46358_2_, int p_i46358_3_) {
        super(p_i46358_1_, p_i46358_2_, p_i46358_3_);
    }

    public CSModelRenderer(int p_i225949_1_, int p_i225949_2_, int p_i225949_3_, int p_i225949_4_) {
        super(p_i225949_1_, p_i225949_2_, p_i225949_3_, p_i225949_4_);
    }

    @OnlyIn(Dist.CLIENT)
    public static class ModelBox {
        private final TexturedQuad[] polygons;
        public final float minX;
        public final float minY;
        public final float minZ;
        public final float maxX;
        public final float maxY;
        public final float maxZ;

        public ModelBox(int p_i225950_1_, int p_i225950_2_, float p_i225950_3_, float p_i225950_4_, float p_i225950_5_, float p_i225950_6_, float p_i225950_7_, float p_i225950_8_, float p_i225950_9_, float p_i225950_10_, float p_i225950_11_, boolean p_i225950_12_, float p_i225950_13_, float p_i225950_14_) {
            this.minX = p_i225950_3_;
            this.minY = p_i225950_4_;
            this.minZ = p_i225950_5_;
            this.maxX = p_i225950_3_ + p_i225950_6_;
            this.maxY = p_i225950_4_ + p_i225950_7_;
            this.maxZ = p_i225950_5_ + p_i225950_8_;
            this.polygons = new TexturedQuad[6];
            float f = p_i225950_3_ + p_i225950_6_;
            float f1 = p_i225950_4_ + p_i225950_7_;
            float f2 = p_i225950_5_ + p_i225950_8_;
            p_i225950_3_ = p_i225950_3_ - p_i225950_9_;
            p_i225950_4_ = p_i225950_4_ - p_i225950_10_;
            p_i225950_5_ = p_i225950_5_ - p_i225950_11_;
            f = f + p_i225950_9_;
            f1 = f1 + p_i225950_10_;
            f2 = f2 + p_i225950_11_;
            if (p_i225950_12_) {
                float f3 = f;
                f = p_i225950_3_;
                p_i225950_3_ = f3;
            }

            PositionTextureVertex modelrenderer$positiontexturevertex7 = new PositionTextureVertex(p_i225950_3_, p_i225950_4_, p_i225950_5_, 0.0F, 0.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex = new PositionTextureVertex(f, p_i225950_4_, p_i225950_5_, 0.0F, 8.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex1 = new PositionTextureVertex(f, f1, p_i225950_5_, 8.0F, 8.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex2 = new PositionTextureVertex(p_i225950_3_, f1, p_i225950_5_, 8.0F, 0.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex3 = new PositionTextureVertex(p_i225950_3_, p_i225950_4_, f2, 0.0F, 0.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex4 = new PositionTextureVertex(f, p_i225950_4_, f2, 0.0F, 8.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex5 = new PositionTextureVertex(f, f1, f2, 8.0F, 8.0F);
            PositionTextureVertex modelrenderer$positiontexturevertex6 = new PositionTextureVertex(p_i225950_3_, f1, f2, 8.0F, 0.0F);
            float f4 = (float)p_i225950_1_;
            float f5 = (float)p_i225950_1_ + p_i225950_8_;
            float f6 = (float)p_i225950_1_ + p_i225950_8_ + p_i225950_6_;
            float f7 = (float)p_i225950_1_ + p_i225950_8_ + p_i225950_6_ + p_i225950_6_;
            float f8 = (float)p_i225950_1_ + p_i225950_8_ + p_i225950_6_ + p_i225950_8_;
            float f9 = (float)p_i225950_1_ + p_i225950_8_ + p_i225950_6_ + p_i225950_8_ + p_i225950_6_;
            float f10 = (float)p_i225950_2_;
            float f11 = (float)p_i225950_2_ + p_i225950_8_;
            float f12 = (float)p_i225950_2_ + p_i225950_8_ + p_i225950_7_;
            this.polygons[2] = new TexturedQuad(new PositionTextureVertex[]{modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex}, f5, f10, f6, f11, p_i225950_13_, p_i225950_14_, p_i225950_12_, Direction.DOWN);
            this.polygons[3] = new TexturedQuad(new PositionTextureVertex[]{modelrenderer$positiontexturevertex1, modelrenderer$positiontexturevertex2, modelrenderer$positiontexturevertex6, modelrenderer$positiontexturevertex5}, f6, f11, f7, f10, p_i225950_13_, p_i225950_14_, p_i225950_12_, Direction.UP);
            this.polygons[1] = new TexturedQuad(new PositionTextureVertex[]{modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex6, modelrenderer$positiontexturevertex2}, f4, f11, f5, f12, p_i225950_13_, p_i225950_14_, p_i225950_12_, Direction.WEST);
            this.polygons[4] = new TexturedQuad(new PositionTextureVertex[]{modelrenderer$positiontexturevertex, modelrenderer$positiontexturevertex7, modelrenderer$positiontexturevertex2, modelrenderer$positiontexturevertex1}, f5, f11, f6, f12, p_i225950_13_, p_i225950_14_, p_i225950_12_, Direction.NORTH);
            this.polygons[0] = new TexturedQuad(new PositionTextureVertex[]{modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex, modelrenderer$positiontexturevertex1, modelrenderer$positiontexturevertex5}, f6, f11, f8, f12, p_i225950_13_, p_i225950_14_, p_i225950_12_, Direction.EAST);
            this.polygons[5] = new TexturedQuad(new PositionTextureVertex[]{modelrenderer$positiontexturevertex3, modelrenderer$positiontexturevertex4, modelrenderer$positiontexturevertex5, modelrenderer$positiontexturevertex6}, f8, f11, f9, f12, p_i225950_13_, p_i225950_14_, p_i225950_12_, Direction.SOUTH);
        }
    }

    @OnlyIn(Dist.CLIENT)
    static class PositionTextureVertex {
        public final Vector3f pos;
        public final float u;
        public final float v;

        public PositionTextureVertex(float p_i1158_1_, float p_i1158_2_, float p_i1158_3_, float p_i1158_4_, float p_i1158_5_) {
            this(new Vector3f(p_i1158_1_, p_i1158_2_, p_i1158_3_), p_i1158_4_, p_i1158_5_);
        }

        public PositionTextureVertex remap(float p_78240_1_, float p_78240_2_) {
            return new PositionTextureVertex(this.pos, p_78240_1_, p_78240_2_);
        }

        public PositionTextureVertex(Vector3f p_i225952_1_, float p_i225952_2_, float p_i225952_3_) {
            this.pos = p_i225952_1_;
            this.u = p_i225952_2_;
            this.v = p_i225952_3_;
        }
    }

    @OnlyIn(Dist.CLIENT)
    static class TexturedQuad {
        public final PositionTextureVertex[] vertices;
        public final Vector3f normal;

        public TexturedQuad(PositionTextureVertex[] p_i225951_1_, float p_i225951_2_, float p_i225951_3_, float p_i225951_4_, float p_i225951_5_, float p_i225951_6_, float p_i225951_7_, boolean p_i225951_8_, Direction p_i225951_9_) {
            this.vertices = p_i225951_1_;
            float f = 0.0F / p_i225951_6_;
            float f1 = 0.0F / p_i225951_7_;
            p_i225951_1_[0] = p_i225951_1_[0].remap(p_i225951_4_ / p_i225951_6_ - f, p_i225951_3_ / p_i225951_7_ + f1);
            p_i225951_1_[1] = p_i225951_1_[1].remap(p_i225951_2_ / p_i225951_6_ + f, p_i225951_3_ / p_i225951_7_ + f1);
            p_i225951_1_[2] = p_i225951_1_[2].remap(p_i225951_2_ / p_i225951_6_ + f, p_i225951_5_ / p_i225951_7_ - f1);
            p_i225951_1_[3] = p_i225951_1_[3].remap(p_i225951_4_ / p_i225951_6_ - f, p_i225951_5_ / p_i225951_7_ - f1);
            if (p_i225951_8_) {
                int i = p_i225951_1_.length;

                for(int j = 0; j < i / 2; ++j) {
                    PositionTextureVertex modelrenderer$positiontexturevertex = p_i225951_1_[j];
                    p_i225951_1_[j] = p_i225951_1_[i - 1 - j];
                    p_i225951_1_[i - 1 - j] = modelrenderer$positiontexturevertex;
                }
            }

            this.normal = p_i225951_9_.step();
            if (p_i225951_8_) {
                this.normal.mul(-1.0F, 1.0F, 1.0F);
            }

        }
    }
}
