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

import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SpawnEggs {

    public static void initEggs() {
        //
    }

    // アストルフォ鎧

    public static final Item ASTOLFO_ARMOR_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "astolfo_armor_spawn_egg"),
            new SpawnEggItem(Entities.ASTOLFO_ARMOR, 0xF8BBD0, 0xFFF176, new Item.Settings())
    );

    // アストルフォ・カシュアル

    public static final Item ASTOLFO_CASUAL_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "astolfo_casual_spawn_egg"),
            new SpawnEggItem(Entities.ASTOLFO_CASUAL, 0xF8BBD0, 0x8655ac, new Item.Settings())
    );

    // アストルフォ女生徒

    public static final Item ASTOLFO_SCHOOLGIRL_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "astolfo_schoolgirl_spawn_egg"),
            new SpawnEggItem(Entities.ASTOLFO_SCHOOLGIRL, 0xF8BBD0, 0xd3828d, new Item.Settings())
    );

    // ボーイキッサー

    public static final Item BOYKISSER_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "boykisser_spawn_egg"),
            new SpawnEggItem(Entities.BOYKISSER, 0xFFFFFF, 0x000000, new Item.Settings())
    );

    // ブリジット

    public static final Item BRIDGET_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "bridget_spawn_egg"),
            new SpawnEggItem(Entities.BRIDGET, 0x7a9ebb, 0xe4ac8a, new Item.Settings())
    );

    // フェリックス

    public static final Item FELIX_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "felix_spawn_egg"),
            new SpawnEggItem(Entities.FELIX, 0x6886a7, 0xf5d3c4, new Item.Settings())
    );

    // 神崎ひでり

    public static final Item KANZAKI_HIDERI_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "kanzaki_hideri_spawn_egg"),
            new SpawnEggItem(Entities.KANZAKI_HIDERI, 0xcacada, 0x9ecec8, new Item.Settings())
    );

    // 潮田渚

    public static final Item SHIOTA_NAGISA_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "shiota_nagisa_spawn_egg"),
            new SpawnEggItem(Entities.SHIOTA_NAGISA, 0x5daeed, 0xffffff, new Item.Settings())
    );

    // ヴェンティ

    public static final Item VENTI_SPAWN_EGG = Registry.register(
            Registries.ITEM,
            Identifier.of("astolfofabric", "venti_spawn_egg"),
            new SpawnEggItem(Entities.VENTI, 0x6bbbab, 0xd7e6ef, new Item.Settings())
    );

}
