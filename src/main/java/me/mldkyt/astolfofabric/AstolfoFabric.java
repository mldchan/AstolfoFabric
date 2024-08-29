package me.mldkyt.astolfofabric;

import me.mldkyt.astolfofabric.entities.*;
import me.mldkyt.astolfofabric.registration.Entities;
import me.mldkyt.astolfofabric.registration.SpawnEggs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class AstolfoFabric implements ModInitializer {
    public static final ItemGroup CUSTOM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of("astolfofabric", "astolfo_fabric_items"),
            FabricItemGroup
                    .builder()
                    .displayName(
                            Text.translatable("itemGroup.astolfofabric.astolfo_fabric_items")
                    )
                    .icon(
                            () -> new ItemStack(SpawnEggs.ASTOLFO_ARMOR_SPAWN_EGG)
                    )
                    .entries((itemGroup, entries) -> {
                        // ここにアイテムを追加する

                        Registries.ITEM.getIds()
                                .stream()
                                .filter((id) ->
                                        id.getNamespace().equals("astolfofabric")
                                )
                                .map(Registries.ITEM::getOrEmpty)
                                .map(Optional::orElseThrow)
                                .forEach(entries::add);
                    })
                    .build()
    );

    @Override
    public void onInitialize() {
        // 属性を登録する
        FabricDefaultAttributeRegistry.register(Entities.ASTOLFO_ARMOR, AstolfoArmorEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.ASTOLFO_CASUAL, AstolfoCasualEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.ASTOLFO_SCHOOLGIRL, AstolfoSchoolGirlEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.BOYKISSER, BoykisserEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.BRIDGET, BridgetEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.FELIX, FelixEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.SHIOTA_NAGISA, ShiotaNagisaEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.KANZAKI_HIDERI, KanzakiHideriEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(Entities.VENTI, VentiEntity.createMobAttributes());
    }
}
