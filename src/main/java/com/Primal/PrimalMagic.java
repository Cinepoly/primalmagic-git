package com.Primal;

import com.Primal.block.ModBlocks;
import com.Primal.item.ModItemGroup;
import com.Primal.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimalMagic implements ModInitializer {
	public static final String MOD_ID = "primalmagic";

	//此记录器用于将文本写入控制台和日志文件。
	//最好使用 mod id 作为 logger 的名称。
	//这样，就可以清楚地知道哪个 Mod 编写了信息、警告和错误。
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//此代码在 Minecraft 处于 mod-load-ready 状态后立即运行。
		//但是，某些内容 （（如资源） ） 可能仍未初始化。
		//请谨慎行事。

		ModItems.registerModItems();//调用ModItems类当中的方法
		ModItemGroup.registerItemGroups();//调用ModItemGroup当中初始化的方法，用于注册新的物品栏
		ModBlocks.registerModBlock();//初始化注册物品的方法
		LOGGER.info("Hello Fabric world!");
	}
}