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
            Identifier.of("astolfofabric", "bridget"),
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
