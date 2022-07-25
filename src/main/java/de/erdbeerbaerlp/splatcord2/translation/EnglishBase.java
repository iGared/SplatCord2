package de.erdbeerbaerlp.splatcord2.translation;

import de.erdbeerbaerlp.splatcord2.storage.Config;

/**
 * Using english as base, extend other localizations from this class
 */
public class EnglishBase {

    public String salmonStage = "Stages:",
            weapons = "Weapons:",
            stagesTitle = "Current Stages",
            futureStagesTitle = "Future Stages",
            footer_ends = "Ends",
            footer_starts = "Starts",
            footer_closed = "Closed",
            salmonRunTitle = "Salmon Run",
            unknownCommand = "Unknown command",
            noAdminPerms = "You need administrative permissions (manage server) to execute this command!",
            stageFeedMsg = "New stage rotations will now be sent here",
            salmonFeedMsg = "New Salmon Runs will now be sent here",
            languageSetMessage = "Your server's language is now set to english",
            unknownLanguage = "You did not specify an valid language, valid languages are german (de), english (en), and italian (it)",
            deleteSuccessful = "Successfully deleted",
            noWritePerms = "This bot has no permission to write in the target channel",
            primarySkill = "Primary Ability:",
            price = "Price:",
            skillSlots = "Ability Slots:",
            splatNetShop = "SplatNet Gear Shop",
            splatnetCooldown = "The SplatNet command is currently on cooldown. Please try again in a few minutes.",
            cmdSettingsLang = "Changes the bot language for this server",
            cmdInviteDesc = "Gives you the invite URL for this bot",
            cmdSetstageDesc = "Marks this channel as the stage notification channel",
            cmdDelstageDesc = "Deletes the set stage notification channel",
            cmdSetsalmonDesc = "Marks this channel as the salmon run notification channel",
            cmdDelsalmonDesc = "Deletes the currently set SalmonRun channel",
            cmdCodeDesc = "Generates an random private battle code",
            cmdCodeArgDesc = "Hide code from others? (Default: show)",
            cmdRotationDesc = "Sends the currently active stages plus the next two rotations",
            cmdSupportDesc = "Gives you the invite link for the discord server of the bot",
            cmdRandomDesc = "Generates random stuff",
            cmdRandomAmountDesc = "Amount to generate (default=1, max=10)",
            cmdRandomTeamAmountDesc = "Amount of players (max 10, min 3. Default 10)",
            cmdRandomTeamWeapons = "Generate random Weapons for the players? (default: false)",
            cmdRandomWeaponDesc = "Generate random weapon(s)",
            cmdRandomStageDesc = "Generate random stage(s)",
            cmdRandomPrivateDesc = "Generate an random private battle",
            cmdSalmonDesc = "Shows current and next salmon run",
            cmdSplatnetDesc = "Shows what is currently available on SplatNet Gear Shop",
            databaseError = "The database is currently down. If this issue persists, contact developer", //Never shows up in other languages
            cmdStatusDB = "Database",
            online = "Online",
            offline = "Offline",
            cmdStatusDesc = "Shows bot status and statistics",
            cmdStatusStats = "Statistics",
            cmdStatusStatsServers = "Servers: ",
            cmdStatusStatsUptime = "Uptime: ",
            cmdStatusStatsDbUptime = "Database-Uptime: ",
            cmdProfileDesc = "Shows your (or someone elses) Splatoon profile(s)", //Should not show up anyway
            cmdEditProfileDesc = "Edits your Splatoon profile(s)", //Should not show up anyway
            cmdProfile1Desc = "Shows your or someone elses Splatoon 1 profile",
            cmdEditProfile1Desc = "Edits your Splatoon 1 profile",
            cmdProfile2Desc = "Shows your or someone elses Splatoon 2 profile",
            cmdEditProfile2Desc = "Edits your Splatoon 2 profile",
            cmdProfile3Desc = "Shows your or someone elses Splatoon 3 profile",
            cmdEditProfile3Desc = "Edits your Splatoon 3 profile",
            cmdProfilennidErr = "Cannot use profile feature without setting Nintendo Network ID or Pretendo Network ID!",
            cmdProfilefcErr = "Cannot use profile feature without setting your Switch friend code!",
            cmdProfileRankFormatNotValid = "Rank format is not valid!",
            cmdProfileS1RankSet = "Your Splatoon 1 rank was set to %rank%",
            cmdProfileS2RankSet = "Your %mode% rank was set to %rank%",
            cmdProfileS2SalmonSet = "Your Salmon Run title was set to %title%",
            cmdProfileSwitchFCDesc = "Your Switch Friend Code",
            cmdProfileNNIDDesc = "Your Nintendo Network ID",
            cmdProfilePNIDDesc = "Your Pretendo Network ID",
            cmdProfileLevelDesc = "Your in-game level",
            cmdProfileNameDesc = "Your in-game name",
            cmdProfileRankDesc = "Your Splatoon Rank (Examples: C-, B, A+ 20, S+99)",
            cmdProfileRank2Desc = "Your Splatoon 2 %mode% Rank (Examples: C-, B, S+4, X 2000)",
            salmonRunTitleUnset = "Intern",
            salmonRunTitleApprentice = "Apprentice",
            salmonRunTitlePartTimer = "Part-Timer",
            salmonRunTitleGoGetter = "Go-Getter",
            salmonRunTitleOverachiever = "Overachiever",
            salmonRunTitleProfreshional = "Profreshional",
            cmdProfileRank = "Rank",
            cmdProfileLevel = "Level",
            cmdProfileSRTitleDesc = "Your Salmon Run Title",
            cmdProfileSRTitle = "Salmon Run Title",
            cmdProfileNameErr = "Name too long! Can only be 10 characters!",
            cmdProfileLevel1Set = "Splatoon 1 level set to ",
            cmdProfileLevel2Set = "Splatoon 2 level set to ",
            cmdProfileNameSet = "In-Game name set to ",
            cmdProfileMissingNID = "%s did not configure an Nintendo Network ID or an Pretendo Network ID yet.",
            cmdProfileMissingFC = "%s did not configure an Switch Friend Code yet.",
            cmdProfileFCSet = "Set Friend Code to ",
            cmdSettingsDesc = "Edit server settings (ex. language)",
            cmdSettingsDelMsg = "Delete old rotation messages?",
            cmdSettingsDelEnable = "Old rotation messages will now be deleted when sending new ones",
            cmdSettingsDelDisable = "Old rotation messages will be kept when sending new ones",
            cmdSettingsArgMissing = "Not enough arguments supplied, settings have not been modified",
            cmdEditProfileArgMissing = "Not enough arguments supplied, profile have not been modified",
            cmdProfileUserDesc = "User to check profile",
            cmdRandomPrivateAlpha = "Team Alpha",
            cmdRandomPrivateBravo = "Team Bravo",
            cmdRandomPrivateSpec = "Spectator",
            now = "Now",
            cmdRandomMode = "Generate random private battle mode",
            cmdRandomModeVersion = "Target splatoon version, Defaults to Splatoon 2",
            cmdRandomPrivateMode = "Mode",
            weaponSub = "Sub",
            weaponSpecial = "Special",
            cmdRandomNumMin = "Smallest possible number to be generated (inclusive), defaults to 0",
            cmdRandomNumMax = "Largest number to be generated (inclusive)",
            cmdRandomNumMinMaxError = "Minimum number cannot be larger than maximum number! Swapping the entered numbers for you...\n\n",
            cmdErrorBlacklistedChar = "Nice try, you cannot use '\" or \\ here!";
    public String getS1MapName(int mapid){
        switch(mapid){
            case 0:
                return "Urchin Underpass";
            case 1:
                return "Walleye Warehouse";
            case 2:
                return "Saltspray Rig";
            case 3:
                return "Arowana Mall";
            case 4:
                return "Blackbelly Skatepark";
            case 5:
                return "Camp Triggerfish";
            case 6:
                return "Port Mackerel";
            case 7:
                return "Kelp Dome";
            case 8:
                return "Moray Towers";
            case 9:
                return "Bluefin Depot";
            case 10:
                return "Hammerhead Bridge";
            case 11:
                return "Flounder Heights";
            case 12:
                return "Museum d'Alfonsino";
            case 13:
                return "Ancho-V Games";
            case 14:
                return "Piranha Pit";
            case 15:
                return "Mahi-Mahi Resort";
            default:
                return "Unknown Map #"+mapid;
        }
    }

}
