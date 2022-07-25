package de.erdbeerbaerlp.splatcord2.storage.json.splatoon1;

import java.util.Arrays;

public class Byml {
    public BymlRoot root = new BymlRoot();

    @Override
    public String toString() {
        return "Byml{" +
                "root=" + root +
                '}';
    }

    public static class BymlRoot {
        public Phase[] Phases = new Phase[0];

        @Override
        public String toString() {
            return "BymlRoot{" +
                    "Phases=" + Arrays.toString(Phases) +
                    '}';
        }
    }

}
