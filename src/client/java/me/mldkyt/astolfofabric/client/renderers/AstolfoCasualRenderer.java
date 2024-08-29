package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.AstolfoCasualEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class AstolfoCasualRenderer extends MobEntityRenderer<AstolfoCasualEntity, PlayerEntityModel<AstolfoCasualEntity>> {
    public AstolfoCasualRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(AstolfoCasualEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/astolfo_casual.png");
    }
}
