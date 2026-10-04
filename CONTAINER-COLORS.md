# Independent container highlight colors (Minecraft 26.2)

Open Mod Menu → Technical Utilities → Configure → Litematica.

- `useLitematicaContainerColors`: off by default; enable to follow Litematica's block overlay colors.
- `containerColorMissing`: cyan, missing item.
- `containerColorWrongItem`: red, wrong item or failed predicate/component check.
- `containerColorWrongAmount`: orange, incorrect quantity.
- `containerColorExtra`: magenta, item in a slot that should be empty.

The four color pickers include opacity. Colors are saved in TechUtils' own configuration and read each time a slot is drawn, including in the inventory verifier overlay. Changing these settings does not change Litematica or printer settings.

Replace the original TechUtils JAR with this build; do not install both copies. The upstream 26.2 dependency requirements remain unchanged.
