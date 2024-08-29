//Astolfo Fabric adds a bunch of femboys and trans girls into Minecraft.
//Copyright (C) 2024  mldkyt
//
//This program is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with this program.  If not, see <https://www.gnu.org/licenses/>.


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
