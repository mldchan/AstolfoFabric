package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.VentiEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;


public class VentiRenderer extends MobEntityRenderer<VentiEntity, PlayerEntityModel<VentiEntity>> {
    public VentiRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(VentiEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/venti.png");
    }
}