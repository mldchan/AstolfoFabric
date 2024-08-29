package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.ShiotaNagisaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class ShiotaNagisaRenderer extends MobEntityRenderer<ShiotaNagisaEntity, PlayerEntityModel<ShiotaNagisaEntity>> {
    public ShiotaNagisaRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(ShiotaNagisaEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/shiota_nagisa.png");
    }
}