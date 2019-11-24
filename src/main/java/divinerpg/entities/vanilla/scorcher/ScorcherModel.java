package divinerpg.entities.vanilla.scorcher;

import divinerpg.entities.base.DivineModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class ScorcherModel extends DivineModel<Scorcher> {
    RendererModel mainBody;
    RendererModel head;
    RendererModel rightArm;
    RendererModel leftArm;
    RendererModel rightArm2;
    RendererModel leftArm2;
    RendererModel leftHorn;
    RendererModel leftHorn2;
    RendererModel rightHorn;
    RendererModel rightHorn2;

    public ScorcherModel() {
        super(1.8F);

        this.textureWidth = 64;
        this.textureHeight = 64;
        this.mainBody = new RendererModel(this, 0, 0);
        this.mainBody.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8);
        this.mainBody.setRotationPoint(-4.0F, 14.0F, -5.0F);
        this.mainBody.setTextureSize(64, 64);
        this.mainBody.mirror = true;
        this.setRotation(this.mainBody, 0.0F, 0.0F, 0.0F);
        this.head = new RendererModel(this, 0, 16);
        this.head.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.head.setRotationPoint(-3.0F, 8.0F, -4.0F);
        this.head.setTextureSize(64, 64);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.rightArm = new RendererModel(this, 0, 48);
        this.rightArm.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.rightArm.setRotationPoint(-9.0F, 19.0F, -2.0F);
        this.rightArm.setTextureSize(64, 64);
        this.rightArm.mirror = true;
        this.setRotation(this.rightArm, 0.0F, 0.0F, 0.0F);
        this.leftArm = new RendererModel(this, 0, 48);
        this.leftArm.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.leftArm.setRotationPoint(3.0F, 19.0F, -2.0F);
        this.leftArm.setTextureSize(64, 64);
        this.leftArm.mirror = true;
        this.setRotation(this.leftArm, 0.0F, 0.0F, 0.0F);
        this.rightArm2 = new RendererModel(this, 0, 48);
        this.rightArm2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.rightArm2.setRotationPoint(-9.0F, 19.0F, -2.0F);
        this.rightArm2.setTextureSize(64, 64);
        this.rightArm2.mirror = true;
        this.setRotation(this.rightArm2, 0.0F, 0.0F, -((float) Math.PI / 2F));
        this.leftArm2 = new RendererModel(this, 0, 48);
        this.leftArm2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.leftArm2.setRotationPoint(7.0F, 19.0F, -2.0F);
        this.leftArm2.setTextureSize(64, 64);
        this.leftArm2.mirror = true;
        this.setRotation(this.leftArm2, 0.0F, 0.0F, -((float) Math.PI / 2F));
        this.leftHorn = new RendererModel(this, 0, 48);
        this.leftHorn.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.leftHorn.setRotationPoint(2.0F, 9.0F, 0.0F);
        this.leftHorn.setTextureSize(64, 64);
        this.leftHorn.mirror = true;
        this.setRotation(this.leftHorn, 0.0F, 0.0F, 0.0F);
        this.leftHorn2 = new RendererModel(this, 0, 48);
        this.leftHorn2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.leftHorn2.setRotationPoint(6.0F, 9.0F, 0.0F);
        this.leftHorn2.setTextureSize(64, 64);
        this.leftHorn2.mirror = true;
        this.setRotation(this.leftHorn2, 0.0F, 0.0F, -((float) Math.PI / 2F));
        this.rightHorn = new RendererModel(this, 0, 48);
        this.rightHorn.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.rightHorn.setRotationPoint(-8.0F, 9.0F, 0.0F);
        this.rightHorn.setTextureSize(64, 64);
        this.rightHorn.mirror = true;
        this.setRotation(this.rightHorn, 0.0F, 0.0F, 0.0F);
        this.rightHorn2 = new RendererModel(this, 0, 48);
        this.rightHorn2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
        this.rightHorn2.setRotationPoint(-8.0F, 9.0F, 0.0F);
        this.rightHorn2.setTextureSize(64, 64);
        this.rightHorn2.mirror = true;
        this.setRotation(this.rightHorn2, 0.0F, 0.0F, -((float) Math.PI / 2F));
    }
}
