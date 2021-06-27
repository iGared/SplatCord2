package de.erdbeerbaerlp.splatcord2.translation;

import de.erdbeerbaerlp.splatcord2.storage.Config;

public class Italian extends EnglishBase {
    {
        salmonStage = "Arene:";
        weapons = "Armi:";
        stagesTitle = "Arene correnti";
        futureStagesTitle = "Prossime arene";
        footer_ends = "Termina";
        footer_closed = "Chiuso";
        unknownCommand = "Comando sconosciuto";
        noAdminPerms = "È necessario avere i permessi di amministratore (Gestire Server) per eseguire questo comando!";
        stageFeedMsg = "Le nuove rotazioni delle arene verranno ora inviate qui";
        salmonFeedMsg = "Le nuove Salmon Run verranno ora inviate qui";
        languageSetMessage = "La lingua del tuo server è ora Italiano";
        helpMessage = "Comandi amministratore:__\n" +
                "/setlang <de|en|it> - Cambia la lingua del bot per questo server\n" +
                "/setsalmon - Seleziona questo canale per le notifiche delle Salmon Run\n" +
                "/delsalmon - Deseleziona il canale impostato per le notifiche delle Salmon Run\n" +
                "/setstage - Seleziona questo canale per le notifiche delle arene\n" +
                "/delstage - Deseleziona il canale impostato per le notifiche delle arene\n\n" +
                "__Comandi utente:__\n" +
                "/code - Genera un codice casuale per una battaglia privata\n" +
                "/invite - Invia l'invito per questo bot\n" +
                "/support - Invia l'invito per il server discord del bot\n" +
                "/rotation - Invia le arene correnti più le due rotazioni successive\n" +
                "/salmon - Invia le Salmon Run correnti o successive\n" +
                "/splatnet - Invia cosa è correntemente disponibile su Calama-zone\n";
        unknownLanguage = "Non hai specificato una lingua valida. Lingue valide: tedesco (de), inglese (en), e italiano (it)";
        deleteSuccessful = "Eliminato correttamente";
        noWritePerms = "Questo bot non ha i permessi necessari per inviare messaggi in questo canale";
        skill = "Abilità:";
        skillSlots = "Slot abilità:";
        price = "Prezzo:";
        splatNetShop  = "Calama-zone";
        splatnetCooldown = "Il comando Calama-zone è correntemente in cooldown. Per favore, riprova tra qualche minuto.";
        cmdSetlangDesc = "Cambia la lingua del bot per questo server";
        cmdInviteDesc = "Invia l'invito per questo bot";
        cmdSetsalmonDesc = "Seleziona questo canale per le notifiche delle Salmon Run";
        cmdDelsalmonDesc = "Deseleziona il canale impostato per le notifiche delle Salmon Run";
        cmdSetstageDesc = "Seleziona questo canale per le notifiche delle arene";
        cmdDelstageDesc = "Deseleziona il canale impostato per le notifiche delle arene";
        cmdCodeDesc = "Genera un codice casuale per una battaglia privata";
        cmdSupportDesc = "Invia l'invito per il server discord del bot";
        cmdSplatnetDesc = "Invia cosa è correntemente disponibile su Calama-zone";
        footer_starts = "Inizia";
        legacyCommand = "Stai usando un comando legacy. Questi comandi verranno presto completamente rimpiazzati da comandi slash.\n" +
                    "Dovresti usare i comandi slash se possibile\n" +
                    "Se sei un amministratore e questo server non può ancora utitlizzare i comandi slash, visita <https://discord.com/api/oauth2/authorize?client_id=822228767165644872&scope=applications.commands> e seleziona questo server. Dopo aver fatto questo esegui " + Config.instance().discord.prefix + "fixslashcommands";
        cmdFixSlashCommands = "I comandi slash entreranno in funzione tra un attimo!\n" +
                    "In caso contrario, contatta lo sviluppatore del bot";
        cmdHelpDesc = "Mostra la lista dei comandi";
        cmdRotationDesc = "Invia le arene correnti più le due rotazioni successive";
        cmdCodeArgDesc = "Nascondi il codice dagli altri? (Predefinito: mostra)";
        cmdRandomAmountDesc = "Quantità da generare (Predefinito: 1, massimo: 10)";
        cmdRandomWeaponDesc = "Genera arma/i casuale/i";
        cmdRandomStageDesc = "Genera arena/e casuale/i";
        cmdSalmonDesc = "Invia le Salmon Run correnti e successive";
        cmdSplatnetDesc = "Invia cosa è correntemente disponibile su Calama-zone";
    }
}
