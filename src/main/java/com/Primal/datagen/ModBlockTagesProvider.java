package com.Primal.datagen;

import com.Primal.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.data.DataGenerator;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagesProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperlookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ILLUSIONARY_BLOCK)
                .add(ModBlocks.REFINING_STONE_BLOCK)
                .add(ModBlocks.MAGIC_BINDING_TABLE)
                .add(ModBlocks.SPIRITUAL_MEDIUM_STONE_BLOCK);
        //这个写入的是有关于方块的数据生成的文件，有关于Pickaxe_Mineable的tag

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ILLUSIONARY_BLOCK)
                .add(ModBlocks.REFINING_STONE_BLOCK)
                .add(ModBlocks.SPIRITUAL_MEDIUM_STONE_BLOCK);
        //这个是写入需要铁制工具的tag,有关于needs_iron_tool的tag

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MAGIC_BINDING_TABLE);

    }

}
