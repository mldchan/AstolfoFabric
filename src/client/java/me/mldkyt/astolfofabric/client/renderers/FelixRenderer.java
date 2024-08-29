package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.FelixEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class FelixRenderer extends MobEntityRenderer<FelixEntity, PlayerEntityModel<FelixEntity>> {
    public FelixRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(FelixEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/felix.png");
    }

}
