package com.bewitchment.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * idol_leonard - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelIdolLeonard extends ModelBase {
	public ModelRenderer plith;
	public ModelRenderer body;
	public ModelRenderer lLeg01;
	public ModelRenderer rLeg01;
	public ModelRenderer head;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer snouta;
	public ModelRenderer snoutSlope;
	public ModelRenderer mHorn01;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer snoutb;
	public ModelRenderer mHorn02;
	public ModelRenderer mHorn03;
	public ModelRenderer lHorn02;
	public ModelRenderer lHorn03;
	public ModelRenderer rHorn02;
	public ModelRenderer rHorn03;
	public ModelRenderer lEarb;
	public ModelRenderer rEarb;
	public ModelRenderer lArm02;
	public ModelRenderer rArm02;
	public ModelRenderer wand;
	
	public ModelIdolLeonard() {
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.lHorn02 = new ModelRenderer(this, 57, 0);
		this.lHorn02.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.lHorn02.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn02, -0.3141592653589793F, 0.0F, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 57, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-1.6F, -4.0F, -0.4F);
		this.rHorn01.addBox(-0.5F, -1.6F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn01, -0.6981317007977318F, 0.0F, -0.5235987755982988F);
		this.lArm02 = new ModelRenderer(this, 0, 0);
		this.lArm02.mirror = true;
		this.lArm02.setRotationPoint(0.1F, 4.0F, 0.0F);
		this.lArm02.addBox(-1.0F, -0.7F, -0.9F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lArm02, 0.0F, 0.0F, 1.3962634015954636F);
		this.snoutSlope = new ModelRenderer(this, 25, 4);
		this.snoutSlope.setRotationPoint(0.0F, -2.7F, -1.8F);
		this.snoutSlope.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(snoutSlope, 0.5235987755982988F, 0.0F, 0.0F);
		this.lHorn03 = new ModelRenderer(this, 57, 0);
		this.lHorn03.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.lHorn03.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn03, 0.2617993877991494F, 0.0F, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 57, 0);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.rHorn02.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn02, -0.3141592653589793F, 0.0F, 0.0F);
		this.wand = new ModelRenderer(this, 0, 15);
		this.wand.mirror = true;
		this.wand.setRotationPoint(-0.1F, 3.7F, 0.0F);
		this.wand.addBox(-4.2F, -0.5F, -0.5F, 9, 1, 1, 0.0F);
		this.setRotateAngle(wand, 0.0F, 0.0F, -0.7853981633974483F);
		this.mHorn01 = new ModelRenderer(this, 57, 0);
		this.mHorn01.setRotationPoint(0.0F, -3.9F, 0.0F);
		this.mHorn01.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(mHorn01, -0.9599310885968813F, 0.0F, 0.0F);
		this.body = new ModelRenderer(this, 22, 13);
		this.body.setRotationPoint(0.0F, 11.1F, -0.6F);
		this.body.addBox(-2.5F, -6.0F, -0.9F, 5, 8, 3, 0.0F);
		this.lEarb = new ModelRenderer(this, 20, 28);
		this.lEarb.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lEarb.addBox(0.0F, -0.2F, -0.7F, 2, 1, 1, 0.0F);
		this.lEar = new ModelRenderer(this, 20, 28);
		this.lEar.setRotationPoint(1.9F, -2.8F, 0.0F);
		this.lEar.addBox(0.0F, -0.8F, -0.7F, 2, 1, 1, 0.0F);
		this.setRotateAngle(lEar, 0.7853981633974483F, 0.13962634015954636F, 0.2617993877991494F);
		this.rHorn03 = new ModelRenderer(this, 57, 0);
		this.rHorn03.mirror = true;
		this.rHorn03.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.rHorn03.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn03, 0.2617993877991494F, 0.0F, 0.0F);
		this.plith = new ModelRenderer(this, 0, 0);
		this.plith.setRotationPoint(0.0F, 24.1F, 0.0F);
		this.plith.addBox(-4.0F, -4.1F, -4.0F, 8, 4, 8, 0.0F);
		this.rArm02 = new ModelRenderer(this, 0, 0);
		this.rArm02.setRotationPoint(0.0F, 3.6F, 0.0F);
		this.rArm02.addBox(-1.0F, -0.7F, -0.9F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rArm02, 0.0F, 0.0F, 1.3962634015954636F);
		this.mHorn03 = new ModelRenderer(this, 57, 0);
		this.mHorn03.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.mHorn03.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(mHorn03, 0.2617993877991494F, 0.0F, 0.0F);
		this.lArm01 = new ModelRenderer(this, 0, 0);
		this.lArm01.mirror = true;
		this.lArm01.setRotationPoint(2.9F, -5.6F, 0.6F);
		this.lArm01.addBox(-1.0F, -0.7F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lArm01, 0.0F, 0.0F, -0.5235987755982988F);
		this.lLeg01 = new ModelRenderer(this, 0, 20);
		this.lLeg01.setRotationPoint(1.6F, 2.7F, 0.5F);
		this.lLeg01.addBox(-1.2F, -0.8F, -1.4F, 2, 8, 3, 0.0F);
		this.head = new ModelRenderer(this, 40, 0);
		this.head.setRotationPoint(0.0F, -5.8F, 0.5F);
		this.head.addBox(-2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(head, 0.0F, 0.5235987755982988F, 0.0F);
		this.rEar = new ModelRenderer(this, 20, 28);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-1.9F, -2.8F, 0.0F);
		this.rEar.addBox(-2.0F, -0.8F, -0.7F, 2, 1, 1, 0.0F);
		this.setRotateAngle(rEar, 0.7853981633974483F, -0.13962634015954636F, -0.2617993877991494F);
		this.lHorn01 = new ModelRenderer(this, 57, 0);
		this.lHorn01.setRotationPoint(1.6F, -4.0F, -0.4F);
		this.lHorn01.addBox(-0.5F, -1.6F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn01, -0.6981317007977318F, 0.0F, 0.5235987755982988F);
		this.rEarb = new ModelRenderer(this, 20, 28);
		this.rEarb.mirror = true;
		this.rEarb.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rEarb.addBox(-2.0F, -0.2F, -0.7F, 2, 1, 1, 0.0F);
		this.rArm01 = new ModelRenderer(this, 0, 0);
		this.rArm01.setRotationPoint(-2.9F, -5.6F, 0.6F);
		this.rArm01.addBox(-1.0F, -0.7F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rArm01, 0.0F, 0.0F, 0.6108652381980153F);
		this.snouta = new ModelRenderer(this, 25, 0);
		this.snouta.setRotationPoint(0.0F, -1.1F, -1.8F);
		this.snouta.addBox(-0.7F, -1.0F, -1.7F, 2, 2, 2, 0.0F);
		this.rLeg01 = new ModelRenderer(this, 0, 20);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-1.4F, 2.7F, 0.5F);
		this.rLeg01.addBox(-1.0F, -0.8F, -1.4F, 2, 8, 3, 0.0F);
		this.snoutb = new ModelRenderer(this, 34, 0);
		this.snoutb.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.snoutb.addBox(-1.3F, -1.0F, -1.7F, 1, 2, 2, 0.0F);
		this.mHorn02 = new ModelRenderer(this, 57, 0);
		this.mHorn02.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.mHorn02.addBox(-0.5F, -1.8F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(mHorn02, -0.3141592653589793F, 0.0F, 0.0F);
		this.lHorn01.addChild(this.lHorn02);
		this.head.addChild(this.rHorn01);
		this.lArm01.addChild(this.lArm02);
		this.head.addChild(this.snoutSlope);
		this.lHorn02.addChild(this.lHorn03);
		this.rHorn01.addChild(this.rHorn02);
		this.rArm02.addChild(this.wand);
		this.head.addChild(this.mHorn01);
		this.lEar.addChild(this.lEarb);
		this.head.addChild(this.lEar);
		this.rHorn02.addChild(this.rHorn03);
		this.rArm01.addChild(this.rArm02);
		this.mHorn02.addChild(this.mHorn03);
		this.body.addChild(this.lArm01);
		this.body.addChild(this.lLeg01);
		this.body.addChild(this.head);
		this.head.addChild(this.rEar);
		this.head.addChild(this.lHorn01);
		this.rEar.addChild(this.rEarb);
		this.body.addChild(this.rArm01);
		this.head.addChild(this.snouta);
		this.body.addChild(this.rLeg01);
		this.snouta.addChild(this.snoutb);
		this.mHorn01.addChild(this.mHorn02);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.body.render(f5);
		this.plith.render(f5);
	}
	
	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
