package com.Primal.datagen;

import com.Primal.block.ModBlocks;
import com.Primal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetContentsLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);


    }

    @Override
    public void generate() {

        //矿石类掉落物的数据生成
            addDrop(ModBlocks.ILLUSIONARY_BLOCK,oreDrops(ModBlocks.ILLUSIONARY_BLOCK,
                    ModItems.ILLUSIONARY_TRANSFORMATION_CURSE));
            addDrop(ModBlocks.REFINING_STONE_BLOCK,oreDrops(ModBlocks.REFINING_STONE_BLOCK,
                    ModItems.REFINING_STONE));
            addDrop(ModBlocks.SPIRITUAL_MEDIUM_STONE_BLOCK,oreDrops(ModBlocks.SPIRITUAL_MEDIUM_STONE_BLOCK,
                    ModItems.SPIRITUAL_MEDIUM_STONE));

            //工作台类似的其他物品掉落物数据生成
             addDrop(ModBlocks.MAGIC_BINDING_TABLE);
    }


    public LootTable.Builder copperOreLinkDrops(Block drop, Item dropItem) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>) this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
                                .apply(net.minecraft.loot.function.SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }


}
