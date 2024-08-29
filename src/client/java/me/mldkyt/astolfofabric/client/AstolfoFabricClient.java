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



package me.mldkyt.astolfofabric.client;

import me.mldkyt.astolfofabric.client.renderers.*;
import me.mldkyt.astolfofabric.registration.Entities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AstolfoFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Entities.ASTOLFO_ARMOR, AstolfoArmorRenderer::new);
        EntityRendererRegistry.register(Entities.ASTOLFO_CASUAL, AstolfoCasualRenderer::new);
        EntityRendererRegistry.register(Entities.ASTOLFO_SCHOOLGIRL, AstolfoSchoolGirlRenderer::new);
        EntityRendererRegistry.register(Entities.BOYKISSER, BoykisserRenderer::new);
        EntityRendererRegistry.register(Entities.BRIDGET, BridgetRenderer::new);
        EntityRendererRegistry.register(Entities.FELIX, FelixRenderer::new);
        EntityRendererRegistry.register(Entities.KANZAKI_HIDERI, KanzakiHideriRenderer::new);
        EntityRendererRegistry.register(Entities.SHIOTA_NAGISA, ShiotaNagisaRenderer::new);
        EntityRendererRegistry.register(Entities.VENTI, VentiRenderer::new);
    }
}
