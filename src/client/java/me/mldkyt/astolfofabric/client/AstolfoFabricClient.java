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
