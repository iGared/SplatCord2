package de.erdbeerbaerlp.splatcord2.commands;

import de.erdbeerbaerlp.splatcord2.Main;
import de.erdbeerbaerlp.splatcord2.storage.json.splatoon2.translations.GameRule;
import de.erdbeerbaerlp.splatcord2.storage.json.splatoon2.translations.Locale;
import de.erdbeerbaerlp.splatcord2.storage.json.splatoon2.translations.Stage;
import de.erdbeerbaerlp.splatcord2.storage.json.splatoon3.translations.TranslationNode;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandData;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import net.dv8tion.jda.api.utils.messages.MessageCreateBuilder;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomCommand extends BaseCommand {
    final String[] weapons = Main.weaponData.keySet().toArray(new String[0]);
    public ArrayList<String> lastRandomWeapons = new ArrayList<>();
    public ArrayList<String> lastRandomWeapons3 = new ArrayList<>();

    public RandomCommand(Locale l) {
        super("random", l.botLocale.cmdRandomDesc);
        final SubcommandData weapon = new SubcommandData("weapon", l.botLocale.cmdRandomWeaponDesc);
        weapon.addOption(OptionType.INTEGER, "amount", l.botLocale.cmdRandomAmountDesc);
        final SubcommandData number = new SubcommandData("number", l.botLocale.cmdRandomWeaponDesc);
        number.addOption(OptionType.INTEGER, "maximum", l.botLocale.cmdRandomNumMin, true);
        number.addOption(OptionType.INTEGER, "minimum", l.botLocale.cmdRandomNumMax, false);
        final SubcommandData stage = new SubcommandData("stage", l.botLocale.cmdRandomStageDesc);
        stage.addOption(OptionType.INTEGER, "amount", l.botLocale.cmdRandomAmountDesc);
        final SubcommandData team = new SubcommandData("private", l.botLocale.cmdRandomPrivateDesc);
        team.addOption(OptionType.INTEGER, "players", l.botLocale.cmdRandomTeamAmountDesc);
        team.addOption(OptionType.BOOLEAN, "weapons", l.botLocale.cmdRandomTeamWeapons);
        final SubcommandData mode = new SubcommandData("mode", l.botLocale.cmdRandomMode);
        OptionData splVersions = new OptionData(OptionType.INTEGER, "version", l.botLocale.cmdRandomModeVersion);
        splVersions.addChoice("Splatoon 2", 2);
        splVersions.addChoice("Splatoon 3", 3);
        weapon.addOptions(splVersions);
        splVersions.addChoice("Splatoon 1", 1);
        mode.addOptions(splVersions);
        addSubcommands(weapon, number, stage, team, mode);
    }

    static <T> void shuffleArray(T[] ar) {
        final Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            T a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    @Override
    public boolean requiresManageServer() {
        return false;
    }

    private void addWeapon(String wpnID) {
        lastRandomWeapons.add(wpnID);
        if (lastRandomWeapons.size() > 8) lastRandomWeapons.remove(0);
    }
    private void addWeapon3(String wpnID) {
        lastRandomWeapons3.add(wpnID);
        if (lastRandomWeapons3.size() > 8) lastRandomWeapons3.remove(0);
    }

    private String getRandomWeaponID(Locale lang) {
        final Random r = new Random();
        do {
            final int weapon = r.nextInt(weapons.length - 1);
            final String wpnid = weapons[weapon];
            if (!lang.weapons.containsKey(Integer.parseInt(wpnid)))
                continue;
            if (lastRandomWeapons.contains(wpnid))
                continue;
            addWeapon(wpnid);
            return wpnid;
        } while (true);
    }
    private String getRandomWeaponID3(Locale lang) {
        final Random r = new Random();
        do {
            final int weapon = r.nextInt(lang.s3locales.weapons.keySet().size()-1);
            final String wpnid = lang.s3locales.weapons.keySet().toArray(new String[0])[weapon];
            if (!lang.s3locales.weapons.containsKey(wpnid))
                continue;
            if (lastRandomWeapons3.contains(wpnid))
                continue;
            addWeapon3(wpnid);
            return wpnid;
        } while (true);
    }

    private String getRandomWeaponName(Locale lang) {
        return lang.weapons.get(Integer.parseInt(getRandomWeaponID(lang))).name;
    }

    @Override
    public void execute(SlashCommandInteractionEvent ev) {
        final Random r = new Random();
        final Locale lang = Main.translations.get(Main.iface.getServerLang(ev.getGuild().getIdLong()));
        final String subcmd = ev.getSubcommandName();
        if (subcmd == null) return;
        int amount = 1;
        final OptionMapping amountOption = ev.getOption("amount");
        if (amountOption != null) try {
            amount = Math.min(Integer.parseInt(amountOption.getAsString()), 10);
        } catch (NumberFormatException ignored) {
        }
        int splVer = 3;
        final OptionMapping versionOption = ev.getOption("version");
        if (versionOption != null) try {
            splVer = Integer.parseInt(versionOption.getAsString());
        } catch (NumberFormatException ignored) {
        }
        switch (subcmd) {
            case "weapon":

                final MessageCreateBuilder mb = new MessageCreateBuilder();
                switch (splVer) {
                    case 2:
                        final ArrayList<MessageEmbed> embeds = new ArrayList<>();
                        for (int i = 0; i < amount; ++i) {
                            final String wpnid = getRandomWeaponID(lang);
                            final de.erdbeerbaerlp.splatcord2.storage.json.splatoon2.weapons.Weapon wpn = Main.weaponData.get(wpnid);
                            embeds.add(new EmbedBuilder()
                                    .setTitle(lang.weapons.get(Integer.parseInt(wpnid)).name)
                                    .setThumbnail("https://splatoon2.ink/assets/splatnet" + wpn.image)
                                    .addField(lang.botLocale.weaponSub, lang.weapon_subs.get(wpn.sub.id).name, true)
                                    .addField(lang.botLocale.weaponSpecial, lang.weapon_specials.get(wpn.special.id).name, true)
                                    .build());

                        }
                        mb.setEmbeds(embeds);
                        break;
                    case 3:
                        final StringBuilder b = new StringBuilder();
                        for (int i = 0; i < amount; ++i) {
                            final String wpnid = getRandomWeaponID3(lang);
                            final TranslationNode wpn = lang.s3locales.weapons.get(wpnid);
                            b.append(wpn.name).append("\n");
                        }
                        mb.setContent(b.toString());
                        break;
                }

                ev.reply(mb.build()).queue();
                break;
            case "number":
                long minimumNumber = 0;
                long maximumNumber = Long.parseLong(ev.getOption("maximum").getAsString());
                final OptionMapping minOption = ev.getOption("minimum");
                if (minOption != null) minimumNumber = Long.parseLong(minOption.getAsString());
                if (minimumNumber > maximumNumber)
                    ev.reply(lang.botLocale.cmdRandomNumMinMaxError + ThreadLocalRandom.current().nextLong(maximumNumber, minimumNumber + 1)).queue();
                else
                    ev.reply(ThreadLocalRandom.current().nextLong(minimumNumber, maximumNumber + 1) + "").queue();
                break;
            case "stage":
                final StringBuilder stageString = new StringBuilder();
                final Stage[] stages = lang.stages.values().toArray(new Stage[0]);
                for (int i = 0; i < amount; ++i) {
                    final int stage = r.nextInt(lang.stages.size() - 1);
                    stageString.append(stages[stage].getName()).append("\n");
                }
                ev.reply(stageString.toString().trim()).queue();
                break;
            case "private":
                boolean genWeapons = false;
                final OptionMapping weaponOption = ev.getOption("weapons");
                if (weaponOption != null) genWeapons = weaponOption.getAsBoolean();

                int players = 10;
                final OptionMapping playersOption = ev.getOption("players");
                if (playersOption != null) try {
                    players = Math.max(3, Math.min(Integer.parseInt(playersOption.getAsString()), 10));
                } catch (NumberFormatException ignored) {
                }
                final Integer[] playerArray = new Integer[players];
                for (int i = 0; i < players; i++) {
                    playerArray[i] = i + 1;
                }
                shuffleArray(playerArray);
                final StringBuilder privateString = new StringBuilder();
                privateString.append(lang.botLocale.cmdRandomPrivateMode + ": " + lang.rules.values().toArray(new GameRule[0])[new Random().nextInt(lang.rules.size())].name).append("\n\n");
                privateString.append(lang.botLocale.cmdRandomPrivateAlpha + ":\n");
                privateString.append("[" + playerArray[0] + "] ");
                if (genWeapons)
                    privateString.append(getRandomWeaponName(lang));
                privateString.append("\n");
                if (players >= 4) {
                    privateString.append("[" + playerArray[2] + "] ");
                    if (genWeapons) {
                        privateString.append(getRandomWeaponName(lang));
                    }
                    privateString.append("\n");
                }
                if (players >= 6) {
                    privateString.append("[" + playerArray[4] + "] ");
                    if (genWeapons)
                        privateString.append(getRandomWeaponName(lang));
                    privateString.append("\n");
                }
                if (players >= 8) {
                    privateString.append("[" + playerArray[6] + "] ");
                    if (genWeapons)
                        privateString.append(getRandomWeaponName(lang));
                    privateString.append("\n");
                }
                privateString.append(lang.botLocale.cmdRandomPrivateBravo + ":\n");
                privateString.append("[" + playerArray[1] + "] ");
                if (genWeapons)
                    privateString.append(getRandomWeaponName(lang));
                privateString.append("\n");
                if (players >= 4) {
                    privateString.append("[" + playerArray[3] + "] ");
                    if (genWeapons)
                        privateString.append(getRandomWeaponName(lang));
                    privateString.append("\n");
                }
                if (players >= 6) {
                    privateString.append("[" + playerArray[5] + "] ");
                    if (genWeapons)
                        privateString.append(getRandomWeaponName(lang));
                    privateString.append("\n");
                }
                if (players >= 8) {
                    privateString.append("[" + playerArray[7] + "] ");
                    if (genWeapons)
                        privateString.append(getRandomWeaponName(lang));
                    privateString.append("\n");
                }
                privateString.append(lang.botLocale.cmdRandomPrivateSpec + ":\n");
                if (players == 3) privateString.append("[" + playerArray[2] + "]\n");
                if (players == 5) privateString.append("[" + playerArray[4] + "]\n");
                if (players == 7) privateString.append("[" + playerArray[6] + "]\n");
                if (players >= 9) privateString.append("[" + playerArray[8] + "]\n");
                if (players == 10) privateString.append("[" + playerArray[9] + "]\n");
                ev.reply(privateString.toString().trim()).setActionRow(Button.danger("delete", Emoji.fromUnicode("U+1F5D1"))).queue();
                break;
            case "mode":
                final StringBuilder modeString = new StringBuilder();

                switch (splVer) {
                    case 1:
                        String mode;
                        do {
                            mode = lang.rules.keySet().toArray(new String[0])[new Random().nextInt(lang.rules.size())];
                        } while (mode.equals("clam_blitz"));
                        modeString.append(lang.rules.get(mode).name);
                        break;
                    case 2:
                        modeString.append(lang.rules.values().toArray(new GameRule[0])[new Random().nextInt(lang.rules.size())].name);
                        break;
                    case 3:
                        modeString.append(lang.s3locales.rules.values().toArray(new TranslationNode[0])[new Random().nextInt(lang.rules.size())].name);
                        break;
                    default:
                        break;
                }
                ev.reply(modeString.toString().trim()).queue();
                break;
        }
    }
}
