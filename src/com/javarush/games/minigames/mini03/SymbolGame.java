package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Простая программа
*/

public class SymbolGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(8, 3);
        String string = "JAVARUSH";
        int length = string.length();
        for (int i = 0; i < length; i++) {
            String substring = string.substring(i, i+1);
            setCellValueEx(i,  1, Color.ORANGE, substring);
        }
    }

    //напишите тут ваш код
}
