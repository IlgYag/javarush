package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 7);
            for (int j = 0; j < 10; j++){
                setCellColor(j,0, Color.RED);
                setCellColor(j,1, Color.ORANGE);
                setCellColor(j,2, Color.YELLOW);
                setCellColor(j,3, Color.GREEN);
                setCellColor(j,4, Color.BLUE);
                setCellColor(j,5, Color.INDIGO);
                setCellColor(j,6, Color.VIOLET);
            }
    }
}
