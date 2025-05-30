package com.Primal.datagen;

import com.Primal.PrimalMagic;
import com.Primal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // 创建自定义Tag并添加物品
        TagKey<Item> sceptreTag = TagKey.of(RegistryKeys.ITEM, Identifier.of(PrimalMagic.MOD_ID, "sceptres"));
        getOrCreateTagBuilder(sceptreTag)
                .add(
                        ModItems.MASTER_SCEPTRE,
                        ModItems.PASTORAL_SCEPTRE,
                        ModItems.SCHOLAR_SCEPTRE,
                        ModItems.ORIGINAL_SCEPTRE
                );
    }
}