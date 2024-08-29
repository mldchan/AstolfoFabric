package me.mldkyt.astolfofabric.client.renderers;

import me.mldkyt.astolfofabric.entities.AstolfoArmorEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class AstolfoArmorRenderer extends MobEntityRenderer<AstolfoArmorEntity, PlayerEntityModel<AstolfoArmorEntity>> {
    //　アストルフォのレンダラー
    public AstolfoArmorRenderer(EntityRendererFactory.Context context) {
        // プレイヤーモデルを使う
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER_SLIM), true), 0.5f);
    }

    @Override
    public Identifier getTexture(AstolfoArmorEntity entity) {
        return Identifier.of("astolfofabric", "textures/entity/astolfo_armor.png");
    }
}
