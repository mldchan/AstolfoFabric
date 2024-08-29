package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.BridgetEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class BridgetRenderer extends MobEntityRenderer<BridgetEntity, PlayerEntityModel<BridgetEntity>> {
    public BridgetRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(BridgetEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/bridget.png");
    }

}
