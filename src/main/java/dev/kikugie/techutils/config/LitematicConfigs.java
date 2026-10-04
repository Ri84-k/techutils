package dev.kikugie.techutils.config;

import com.google.common.collect.ImmutableList;
import fi.dy.masa.malilib.config.options.*;
import fi.dy.masa.malilib.hotkeys.KeybindSettings;

public class LitematicConfigs extends Configs.BaseConfigs {
	public static final ConfigHotkey ROTATE_PLACEMENT = new ConfigHotkey("rotatePlacement", "",
		"Rotate selected placement clockwise");
	public static final ConfigHotkey MIRROR_PLACEMENT = new ConfigHotkey("mirrorPlacement", "",
		"Cycle through selected placement's mirroring options");
	public static final ConfigBooleanHotkeyed INVENTORY_SCREEN_OVERLAY = new ConfigBooleanHotkeyed("inventoryScreenOverlay", true, "", KeybindSettings.GUI, """
		Show layout of the container according to the litematic placement.
		Colors use TechUtils' container color settings, or Litematica colors when enabled:
		- Light blue: missing item;
		- Orange: mismatched amount or nbt data;
		- Magenta: extra item that shouldn't be present;
		- Red: wrong item type.""");
	public static final ConfigHotkey REFRESH_MATERIAL_LIST = new ConfigHotkey("refreshMaterialList", "", """
		Refreshes active Litematica material list.
		§7This can be used in combination with layered lists to update the HUD when changing the active layer.""");
	public static final ConfigBooleanHotkeyed EASY_PLACE_FULL_BLOCKS = new ConfigBooleanHotkeyed("easyPlaceFullBlocks", false, "", """
		Treat all blocks as full cubes when using Litematica's easy place feature.
		§7Useful for placing blocks with small hitboxes like buttons, chains, fences, etc.""");
	public static final ConfigBooleanHotkeyed VERIFY_ITEM_COMPONENTS = new ConfigBooleanHotkeyed("verifyItemComponents", false, "", KeybindSettings.GUI, """
		Make the inventory verifier enforce exact item component matches.
		§7Also adds the present components to the lore!""");
	public static final ConfigBooleanHotkeyed REPLACE_ITEM_PREDICATES_WITH_PLACEHOLDERS = new ConfigBooleanHotkeyed("replaceItemPredicatesWithPlaceholders", false, "", """
		When loading a schematic, replaces each Item Predicate with its stored placeholder, if present.""");
	public static final ConfigBooleanHotkeyed FORCE_SCHEMATIC_ITEM_OVERLAY = new ConfigBooleanHotkeyed("forceSchematicItemOverlay", false, "", KeybindSettings.GUI, """
		Overwrite each slot in the opened container to show the schematic item instead of the real one.""");

	public static final ConfigBoolean USE_LITEMATICA_CONTAINER_COLORS = new ConfigBoolean("useLitematicaContainerColors", false,
		"Use Litematica's block overlay colors for container highlights instead of the independent colors below.");
	public static final ConfigColor CONTAINER_COLOR_MISSING = new ConfigColor("containerColorMissing", "#8000FFFF",
		"Container slot background for a missing item. Includes opacity.");
	public static final ConfigColor CONTAINER_COLOR_WRONG = new ConfigColor("containerColorWrongItem", "#80FF0000",
		"Container slot background for a wrong item or failed item predicate/component check. Includes opacity.");
	public static final ConfigColor CONTAINER_COLOR_MISMATCHED = new ConfigColor("containerColorWrongAmount", "#80FF8000",
		"Container slot background for an incorrect item quantity. Includes opacity.");
	public static final ConfigColor CONTAINER_COLOR_EXTRA = new ConfigColor("containerColorExtra", "#80FF00FF",
		"Container slot background for an item in a slot that should be empty. Includes opacity.");

	public LitematicConfigs() {
		super(ImmutableList.of(
			ROTATE_PLACEMENT,
			MIRROR_PLACEMENT,
			INVENTORY_SCREEN_OVERLAY,
			USE_LITEMATICA_CONTAINER_COLORS,
			CONTAINER_COLOR_MISSING,
			CONTAINER_COLOR_WRONG,
			CONTAINER_COLOR_MISMATCHED,
			CONTAINER_COLOR_EXTRA,
			REFRESH_MATERIAL_LIST,
			EASY_PLACE_FULL_BLOCKS,
			VERIFY_ITEM_COMPONENTS,
			REPLACE_ITEM_PREDICATES_WITH_PLACEHOLDERS,
			FORCE_SCHEMATIC_ITEM_OVERLAY
		));
	}
}
