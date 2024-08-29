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

package me.mldkyt.astolfofabric;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.context.CommandContext;
import me.mldkyt.astolfofabric.entities.*;
import me.mldkyt.astolfofabric.registration.Entities;
import me.mldkyt.astolfofabric.registration.SpawnEggs;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;

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

        // コマンドを登録する

        CommandRegistrationCallback.EVENT.register(this::registerCommands);
    }

    private void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("duplicatecuties")
                .requires((source) -> source.hasPermissionLevel(2))
                .requires(ServerCommandSource::isExecutedByPlayer)
                .then(CommandManager.argument("amount", DoubleArgumentType.doubleArg(1))
                        .then(CommandManager.argument("range", DoubleArgumentType.doubleArg(1, 100))
                                .executes(this::executeTestCommand))));
    }

    private int executeTestCommand(CommandContext<ServerCommandSource> context) {
        ServerCommandSource source = context.getSource();
        double range = context.getArgument("range", Double.class);
        double amount = context.getArgument("amount", Double.class);

        double playerX = source.getPosition().getX();
        double playerY = source.getPosition().getY();
        double playerZ = source.getPosition().getZ();

        PlayerEntity p = source.getPlayer();

        if (p == null) {
            return 0;
        }

        // プレーヤーの周りのエンティティを見つける
        Box box = new Box(playerX - range / 2, playerY - range / 2, playerZ - range / 2, playerX + range / 2, playerY + range / 2, playerZ + range / 2);

        int duplicated = 0;

        for (AstolfoFabricEntity entity : p.getWorld().getEntitiesByClass(AstolfoFabricEntity.class, box, (entity) -> true)) {
            try {
                @SuppressWarnings("unchecked")
                EntityType<? extends AstolfoFabricEntity> type = (EntityType<? extends AstolfoFabricEntity>) entity.getType();
                AstolfoFabricEntity newEntity = new AstolfoFabricEntity(type, p.getWorld());
                newEntity.copyPositionAndRotation(entity);
                p.getWorld().spawnEntity(newEntity);
                duplicated++;
            } catch (ClassCastException e) {
                // Handle the exception, e.g., log it or notify the user
                System.err.println("Failed to cast entity type: " + e.getMessage());
            }
        }
        int finalDuplicated = duplicated;
        source.sendFeedback(() -> Text.literal("Duplicated %d cuties!".formatted(finalDuplicated)), false);

        return 1;
    }
}
