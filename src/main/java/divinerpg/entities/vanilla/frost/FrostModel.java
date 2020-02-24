package divinerpg.entities.vanilla.frost;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class FrostModel extends DivineModel<Frost> {
    ModelRenderer frostBody;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer horn3;
    ModelRenderer horn4;
    ModelRenderer shard1;
    ModelRenderer shard2;
    ModelRenderer shard3;
    ModelRenderer shard4;

    public FrostModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.frostBody = new ModelRenderer(this, 0, 11);
        this.frostBody.func_228300_a_(0.0F, 0.0F, 0.0F, 8, 8, 2);
        this.frostBody.setRotationPoint(-4.0F, 10.0F, -2.0F);
        this.frostBody.setTextureSize(64, 32);
        this.frostBody.mirror = true;
        this.setRotation(this.frostBody, 0.0F, 0.0F, 0.0F);
        this.horn1 = new ModelRenderer(this, 0, 0);
        this.horn1.func_228300_a_(0.0F, 0.0F, 0.0F, 8, 1, 2);
        this.horn1.setRotationPoint(-9.0F, 5.0F, -2.0F);
        this.horn1.setTextureSize(64, 32);
        this.horn1.mirror = true;
        this.setRotation(this.horn1, 0.0F, 0.0F, ((float) Math.PI / 4F));
        this.horn2 = new ModelRenderer(this, 0, 0);
        this.horn2.func_228300_a_(0.0F, 0.0F, 0.0F, 8, 1, 2);
        this.horn2.setRotationPoint(-9.0F, 22.0F, -2.0F);
        this.horn2.setTextureSize(64, 32);
        this.horn2.mirror = true;
        this.setRotation(this.horn2, 0.0F, 0.0F, -((float) Math.PI / 4F));
        this.horn3 = new ModelRenderer(this, 0, 0);
        this.horn3.func_228300_a_(0.0F, 0.0F, 0.0F, 7, 1, 2);
        this.horn3.setRotationPoint(4.0F, 17.0F, -2.0F);
        this.horn3.setTextureSize(64, 32);
        this.horn3.mirror = true;
        this.setRotation(this.horn3, 0.0F, 0.0F, ((float) Math.PI / 4F));
        this.horn4 = new ModelRenderer(this, 0, 0);
        this.horn4.func_228300_a_(0.0F, 0.0F, 0.0F, 8, 1, 2);
        this.horn4.setRotationPoint(3.0F, 11.0F, -2.0F);
        this.horn4.setTextureSize(64, 32);
        this.horn4.mirror = true;
        this.setRotation(this.horn4, 0.0F, 0.0F, -((float) Math.PI / 4F));
        this.shard1 = new ModelRenderer(this, 0, 0);
        this.shard1.func_228300_a_(0.0F, 0.0F, 0.0F, 14, 1, 2);
        this.shard1.setRotationPoint(-7.0F, 7.0F, -2.0F);
        this.shard1.setTextureSize(64, 32);
        this.shard1.mirror = true;
        this.setRotation(this.shard1, 0.0F, 0.0F, 0.0F);
        this.shard2 = new ModelRenderer(this, 0, 0);
        this.shard2.func_228300_a_(0.0F, 0.0F, 0.0F, 14, 1, 2);
        this.shard2.setRotationPoint(-7.0F, 20.53333F, -2.0F);
        this.shard2.setTextureSize(64, 32);
        this.shard2.mirror = true;
        this.setRotation(this.shard2, 0.0F, 0.0F, 0.0F);
        this.shard3 = new ModelRenderer(this, 0, 0);
        this.shard3.func_228300_a_(0.0F, 0.0F, 0.0F, 14, 1, 2);
        this.shard3.setRotationPoint(-7.0F, 7.0F, -2.0F);
        this.shard3.setTextureSize(64, 32);
        this.shard3.mirror = true;
        this.setRotation(this.shard3, 0.0F, 0.0F, ((float) Math.PI / 2F));
        this.shard4 = new ModelRenderer(this, 0, 0);
        this.shard4.func_228300_a_(0.0F, 0.0F, 0.0F, 14, 1, 2);
        this.shard4.setRotationPoint(8.0F, 7.0F, -2.0F);
        this.shard4.setTextureSize(64, 32);
        this.shard4.mirror = true;
        this.setRotation(this.shard4, 0.0F, 0.0F, ((float) Math.PI / 2F));
    }
}