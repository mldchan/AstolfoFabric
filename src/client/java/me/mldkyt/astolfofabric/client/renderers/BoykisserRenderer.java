package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.BoykisserEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class BoykisserRenderer extends MobEntityRenderer<BoykisserEntity, PlayerEntityModel<BoykisserEntity>> {
    public BoykisserRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(BoykisserEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/boykisser.png");
    }

}
