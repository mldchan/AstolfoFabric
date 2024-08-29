package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.AstolfoSchoolGirlEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class AstolfoSchoolGirlRenderer extends MobEntityRenderer<AstolfoSchoolGirlEntity, PlayerEntityModel<AstolfoSchoolGirlEntity>> {
    public AstolfoSchoolGirlRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), false), 0.5f);
    }

    @Override
    public Identifier getTexture(AstolfoSchoolGirlEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/astolfo_schoolgirl.png");
    }
}
