package com.Primal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmeltingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.BlastingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {

    // 替换为你的物品注册类中的实际物品引用
    public static final ItemConvertible ORIGINAL_SCEPTRE = /* 你的法杖物品 */;
    public static final ItemConvertible ILLUSIONARY_BLOCK = /* 你的输入物品 */;
    public static final ItemConvertible ILLUSIONARY_TRANSFORMATION_CURSE = /* 你的输出物品 */;

    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // 有形状合成配方（如法杖）
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ORIGINAL_SCEPTRE)
                .input('E', Items.END_CRYSTAL)
                .input('A', Items.AMETHYST_BLOCK)
                .input('D', Items.DIAMOND_BLOCK)
                .input('I', Items.IRON_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('L', Items.LAPIS_BLOCK)
                .pattern("AD ")
                .pattern("DEI")
                .pattern(" GL")
                .criterion("has_item", conditionsFromItem(ORIGINAL_SCEPTRE))
                .offer(exporter, "original_sceptre");
        //学术法杖
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ORIGINAL_SCEPTRE)
                .input('E', Items.END_CRYSTAL)
                .input('A', Items.AMETHYST_BLOCK)
                .input('D', Items.DIAMOND_BLOCK)
                .input('I', Items.IRON_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('L', Items.LAPIS_BLOCK)
                .pattern("AD ")
                .pattern("DEI")
                .pattern(" GL")
                .criterion("has_item", conditionsFromItem(ORIGINAL_SCEPTRE))
                .offer(exporter, "original_sceptre");
        //大师权杖
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ORIGINAL_SCEPTRE)
                .input('E', Items.END_CRYSTAL)
                .input('A', Items.AMETHYST_BLOCK)
                .input('D', Items.DIAMOND_BLOCK)
                .input('I', Items.IRON_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('L', Items.LAPIS_BLOCK)
                .pattern("AD ")
                .pattern("DEI")
                .pattern(" GL")
                .criterion("has_item", conditionsFromItem(ORIGINAL_SCEPTRE))
                .offer(exporter, "original_sceptre");
        //权力法杖
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ORIGINAL_SCEPTRE)
                .input('E', Items.END_CRYSTAL)
                .input('A', Items.AMETHYST_BLOCK)
                .input('D', Items.DIAMOND_BLOCK)
                .input('I', Items.IRON_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('L', Items.LAPIS_BLOCK)
                .pattern("AD ")
                .pattern("DEI")
                .pattern(" GL")
                .criterion("has_item", conditionsFromItem(ORIGINAL_SCEPTRE))
                .offer(exporter, "original_sceptre");
        //教皇权杖
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ORIGINAL_SCEPTRE)
                .input('E', Items.END_CRYSTAL)
                .input('A', Items.AMETHYST_BLOCK)
                .input('D', Items.DIAMOND_BLOCK)
                .input('I', Items.IRON_BLOCK)
                .input('G', Items.GOLD_BLOCK)
                .input('L', Items.LAPIS_BLOCK)
                .pattern("AD ")
                .pattern("DEI")
                .pattern(" GL")
                .criterion("has_item", conditionsFromItem(ORIGINAL_SCEPTRE))
                .offer(exporter, "original_sceptre");
        //原初法杖



        // 熔炉配方（smelting）

        SmeltingRecipeJsonBuilder.create(
                        Ingredient.ofItems(ILLUSIONARY_BLOCK),
                        RecipeCategory.MISC,
                        ILLUSIONARY_TRANSFORMATION_CURSE,
                        8.0f, 355
                )
                .group("illusionary_transformation_curse")
                .criterion("has_item", conditionsFromItem(ILLUSIONARY_BLOCK))
                .offer(exporter, "itc_from_smilting_ib");

        // 高炉配方（blasting）
        BlastingRecipeJsonBuilder.create(
                        Ingredient.ofItems(ILLUSIONARY_BLOCK),
                        RecipeCategory.MISC,
                        ILLUSIONARY_TRANSFORMATION_CURSE,
                        10.0f, 150
                )
                .group("primalmagic:illusionary_transformation_curse")
                .criterion("has_item", conditionsFromItem(ILLUSIONARY_BLOCK))
                .offer(exporter, "itc_from_blasting_ib");

        //幻化石





    }
}