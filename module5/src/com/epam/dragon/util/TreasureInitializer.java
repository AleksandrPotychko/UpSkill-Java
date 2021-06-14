package com.epam.dragon.util;

import com.epam.dragon.entity.Treasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TreasureInitializer {
    public static List<Treasure> createRandomTreasures(int quantity) {
        List<Treasure> treasures = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            String name = "Treasure number " + (i + 1);
            treasures.add(new Treasure(name, random.nextInt(1000)));
        }
        return treasures;
    }

    public static List<Treasure> createTreasures() {
        List<Treasure> treasures = new ArrayList<>();
        treasures.add(new Treasure("The crown of thunderbolts", 200));
        treasures.add(new Treasure("The curse of the strong", 123));
        treasures.add(new Treasure("The gem of effective toxin", 452));
        treasures.add(new Treasure("Shining Ice", 562));
        treasures.add(new Treasure("A cackle of swiftness", 3));
        treasures.add(new Treasure("Legacy of Dreams", 17));
        treasures.add(new Treasure("A shard of red soul stone", 42));
        treasures.add(new Treasure("The Curse of the Afflicted", 57));
        treasures.add(new Treasure("The illuminating gem", 254));
        treasures.add(new Treasure("The Gem of Lightness", 2367));
        treasures.add(new Treasure("The power of simplicity", 265));
        treasures.add(new Treasure("Wound remedy", 287));
        treasures.add(new Treasure("The Stomach of a Wild Roast Beast", 87));
        treasures.add(new Treasure("Moratorium", 77));
        treasures.add(new Treasure("Esoteric Transformation", 64));
        treasures.add(new Treasure("The gift of the moneylender", 26));
        treasures.add(new Treasure("Ze'ev the stone of vengeance", 783));
        treasures.add(new Treasure("Thug", 2145));
        treasures.add(new Treasure("The Curse of the Captives", 536));
        treasures.add(new Treasure("Myrine, Star Weaver's Tear", 73));
        treasures.add(new Treasure("Amethyst", 896));
        treasures.add(new Treasure("Flawless royal amethyst", 512));
        treasures.add(new Treasure("Royal diamond", 567));
        treasures.add(new Treasure("Flawless royal diamond", 63));
        treasures.add(new Treasure("Royal amethyst", 74));
        treasures.add(new Treasure("Flawless royal amethyst", 75));
        treasures.add(new Treasure("Royal ruby", 854));
        treasures.add(new Treasure("Flawless royal ruby", 321));
        treasures.add(new Treasure("Royal topaz", 473));
        treasures.add(new Treasure("Flawless royal topaz", 8745));
        treasures.add(new Treasure("Arreatic martial ornament", 543));
        treasures.add(new Treasure("Forgotten soul", 2578));
        treasures.add(new Treasure("Caldean nightdress", 65));
        treasures.add(new Treasure("Flesh of a fallen angel", 432));
        treasures.add(new Treasure("Holy water from Westmarsh", 786));
        treasures.add(new Treasure("Handar rune", 172));
        treasures.add(new Treasure("Amethyst essence", 193));
        treasures.add(new Treasure("Diamond essence", 363));
        treasures.add(new Treasure("Essence of emerald", 8765));
        treasures.add(new Treasure("Ruby essence", 473));
        treasures.add(new Treasure("Essence", 327));
        treasures.add(new Treasure("Wizard dust", 637));
        treasures.add(new Treasure("The Breath of Death", 3735));
        treasures.add(new Treasure("Blurred Crystal", 5377));
        treasures.add(new Treasure("Simple dagger", 78));
        treasures.add(new Treasure("Knife", 764));
        treasures.add(new Treasure("Sword", 764));
        treasures.add(new Treasure("Shield", 437));
        treasures.add(new Treasure("Bow", 278));
        treasures.add(new Treasure("Long bow", 643));
        treasures.add(new Treasure("Wide-bladed axe", 735));
        treasures.add(new Treasure("Battle axe", 754));
        treasures.add(new Treasure("Envious blade", 632));
        treasures.add(new Treasure("Blade", 8765));
        treasures.add(new Treasure("The serrated dagger", 865));
        treasures.add(new Treasure("Shortened dagger", 653));
        treasures.add(new Treasure("Sharpening", 53));
        treasures.add(new Treasure("Blunt", 67));
        treasures.add(new Treasure("Combat crowbar", 678));
        treasures.add(new Treasure("Double-sided cleaver", 553));
        treasures.add(new Treasure("Nutcracker", 532));
        treasures.add(new Treasure("Jace's Hammer of Vigilance", 578));
        treasures.add(new Treasure("The royal sword of swiftness", 554));
        treasures.add(new Treasure("Griswold's serrated sword", 335));
        treasures.add(new Treasure("The blade of the wurdalak King", 6789));
        treasures.add(new Treasure("Assassin of the Gods", 8765));
        treasures.add(new Treasure("Amber Wing", 345));
        treasures.add(new Treasure("Saber", 643));
        treasures.add(new Treasure("Steel Veil", 735));
        treasures.add(new Treasure("Leorik's Crown", 733));
        treasures.add(new Treasure("Jester's comb", 6532));
        treasures.add(new Treasure("Crown of the undead", 542));
        treasures.add(new Treasure("The mysterious helmet", 247));
        treasures.add(new Treasure("Hood", 673));
        treasures.add(new Treasure("Ringed hood", 321));
        treasures.add(new Treasure("Mysterious shoulder pads", 457));
        treasures.add(new Treasure("Leather robe", 432));
        treasures.add(new Treasure("Shoulder of the Skeleton King", 765));
        treasures.add(new Treasure("The will of Razet.", 431));
        treasures.add(new Treasure("Hellfire amulet", 368));
        treasures.add(new Treasure("Optical amulet", 753));
        treasures.add(new Treasure("The mysterious amulet", 428));
        treasures.add(new Treasure("Hoppy necklace", 876));
        treasures.add(new Treasure("The patronage of the moonlight", 985));
        treasures.add(new Treasure("Leorik's golden necklace", 564));
        treasures.add(new Treasure("Kalan's Wisdom", 367));
        treasures.add(new Treasure("Mirror", 732));
        treasures.add(new Treasure("The Eye", 789));
        treasures.add(new Treasure("Magic crystal", 543));
        treasures.add(new Treasure("The crucible", 221));
        treasures.add(new Treasure("Root", 1));
        treasures.add(new Treasure("The mirror of eternity", 356));
        treasures.add(new Treasure("Crystal ball", 753));
        treasures.add(new Treasure("Herbs", 467));
        treasures.add(new Treasure("The Hand of the Prophet", 3235));
        treasures.add(new Treasure("Mysterious boots", 256));
        treasures.add(new Treasure("Boots", 433));
        treasures.add(new Treasure("Lute stockings", 235));
        treasures.add(new Treasure("Very simple boots", 676));
        treasures.add(new Treasure("Rivera's dancing shoes", 4343));
        return treasures;
    }
}
