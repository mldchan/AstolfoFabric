package me.mldkyt.astolfofabric.registration;

import me.mldkyt.astolfofabric.entities.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Entities {

    // アストルフォ鎧

    public static final EntityType<AstolfoArmorEntity> ASTOLFO_ARMOR = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "astolfo_armor"),
            EntityType.Builder.create(AstolfoArmorEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    // アストルフォ・カシュアル

    public static final EntityType<AstolfoCasualEntity> ASTOLFO_CASUAL = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "astolfo_casual"),
            EntityType.Builder.create(AstolfoCasualEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    // アストルフォ女生徒

    public static final EntityType<AstolfoSchoolGirlEntity> ASTOLFO_SCHOOLGIRL = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "astolfo_schoolgirl"),
            EntityType.Builder.create(AstolfoSchoolGirlEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    // ボーイキッサー

    public static final EntityType<BoykisserEntity> BOYKISSER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "boykisser"),
            EntityType.Builder.create(BoykisserEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );


    // ブリジット

    public static final EntityType<BridgetEntity> BRIDGET = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "boykisser"),
            EntityType.Builder.create(BridgetEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    //　フェリックス

    public static final EntityType<FelixEntity> FELIX = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "felix"),
            EntityType.Builder.create(FelixEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    // 神崎ひでり

    public static final EntityType<KanzakiHideriEntity> KANZAKI_HIDERI = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "kanzaki_hideri"),
            EntityType.Builder.create(KanzakiHideriEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    // 潮田渚

    public static final EntityType<ShiotaNagisaEntity> SHIOTA_NAGISA = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "shiotanagisa"),
            EntityType.Builder.create(ShiotaNagisaEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

    // ヴェンティ

    public static final EntityType<VentiEntity> VENTI = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("astolfofabric", "venti"),
            EntityType.Builder.create(VentiEntity::new, SpawnGroup.CREATURE)
                    .dimensions(0.6f, 1.8f) // 幅0.6m、高さ1.8m, プレイヤーのサイズ
                    .build()
    );

}
