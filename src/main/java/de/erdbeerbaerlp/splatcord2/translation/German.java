package de.erdbeerbaerlp.splatcord2.translation;

import de.erdbeerbaerlp.splatcord2.storage.Config;

public class German extends EnglishBase {
    {
        salmonStage = "Arenen:";
        weapons = "Waffen:";
        stagesTitle = "Aktuelle Arenen";
        futureStagesTitle = "Zukünftige Arenen";
        footer_ends = "Endet";
        footer_starts = "Startet";
        footer_closed = "Geschlossen";
        unknownCommand = "Unbekannter Befehl";
        noAdminPerms = "Du benötigst Administrative Berechtigungen (Server verwalten) um diesen Befehl auszuführen!";
        stageFeedMsg = "Aktuelle Arenen werden nun regelmäßig in diesen Kanal gesendet";
        salmonFeedMsg = "Aktuelle Salmon Runs werden nun regelmäßig in diesen Kanal gesendet";
        languageSetMessage = "Die Sprache dieses Servers ist nun auf Deutsch eingestellt";
        helpMessage = "__Adminbefehle:__\n" +
                "/setlang <de|en|it> - Ändert die Botsprache für diesen Server\n" +
                "/setsalmon - Markiert einen Kanal für SalmonRun Benachrichtigungen\n" +
                "/delsalmon - Löscht den gesetzten SalmonRun-Kanal\n" +
                "/setstage - Markiert einen Kanal für Arena benachrichtigungen\n" +
                "/delstage - Löscht den gesetzten Arena-Kanal\n\n" +
                "__Nutzerbefehle:__\n" +
                "/code - Generiert einen zufälligen Privatkampf-code\n" +
                "/invite - Sendet den Einladungslink des bots\n" +
                "/support - Sendet den Einladungslink zum Discord vom Bot\n" +
                "/rotation - Sendet die aktuell aktiven Arenen und die nächsten Rotationen\n" +
                "/salmon - Sendet den Aktuellen oder Kommenden SalmonRun\n" +
                "/splatnet - Sendet die aktuelle Ausrüstung von TentaWorld. Kürzel: `sn`, `gear`\n";
        unknownLanguage = "Du hast keine valide Sprache angegeben. Vorhandene Sprachen: Deutsch (de), Englisch (en), und Italienisch (it)";
        deleteSuccessful = "Erfolgreich gelöscht!";
        noWritePerms = "Dieser Bot hat keine Berechtigung, Nachrichten in diesen Kanal zu senden";
        skill = "Effekt:";
        skillSlots = "Effekt-Slots:";
        price = "Preis:";
        splatNetShop = "TentaWorld";
        splatnetCooldown = "Der TentaWorld-Befehl ist gerade im Cooldown. Versuche es in ein paar Minuten erneut.";
        legacyCommand = "Du verwendest einen veralteten Befehl. Diese Befehle werden bald durch Slash-Befehle ersetzt!\n" +
                "Wenn du bereits Slash-Befehle nutzen kannst, solltest du stattdessen lieber diese verwenden\n" +
                "Falls du Server-Admin bist und noch keine Slash-Befehle nutzen kannst, besuche <https://discord.com/api/oauth2/authorize?client_id=822228767165644872&scope=applications.commands> und wähle diesen Server aus. Danach kannst du die Slash-Befehle mit " + Config.instance().discord.prefix + "fixslashcommands aktivieren";
        cmdFixSlashCommands = "Slash-Befehle sollten nur wieder funktionieren!\n" +
                "Falls dies nicht der fall ist, kontaktiere den Bot-Entwickler";
        cmdSetlangDesc = "Ändert die Botsprache für diesen Server";
        cmdHelpDesc = "Zeigt eine Befehlsliste";
        cmdInviteDesc = "Sendet den Einladungslink des Bots";
        cmdSetsalmonDesc = "Markiert einen Kanal für SalmonRun Benachrichtigungen";
        cmdDelsalmonDesc = "Löscht den gesetzten SalmonRun-Kanal";
        cmdSetstageDesc = "Markiert einen Kanal für Arena benachrichtigungen";
        cmdDelstageDesc = "Löscht den gesetzten Arena-Kanal";
        cmdCodeDesc = "Generiert einen zufälligen Privatkampf-code";
        cmdCodeArgDesc = "Code vor anderen verstecken? (Standart: wird angezeigt)";
        cmdRotationDesc = "Sendet die aktuell aktiven Arenen und die nächsten Rotationen";
        cmdSupportDesc = "Sendet den Einladungslink zum Discord vom Bot";
        cmdRandomAmountDesc = "Anzahl zum Generieren (standart=1, maximum=10)";
        cmdRandomWeaponDesc = "Generiere zufällige Waffen";
        cmdRandomStageDesc = "Generiere zufällige Arenen";
        cmdSalmonDesc = "Zeigt aktuellen und nächsten Salmon Run";
        cmdSplatnetDesc = "Sendet die aktuelle Ausrüstung von TentaWorld";
    }
}
