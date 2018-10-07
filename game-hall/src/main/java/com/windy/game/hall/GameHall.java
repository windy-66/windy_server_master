package com.windy.game.hall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import com.windy.game.engine.utils.UtilTools;

/**
 * 游戏大厅服务器启动类
 *
 * @author jiaxiaocheng
 * @create 2018-09-28 0:03
 **/
public class GameHall {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameHall.class);

    public static void main(String[] args) {

        LOGGER.info("gamehall start");
     //   UtilTools.tip();
        LOGGER.error("gamehall start");
        LOGGER.warn("gamehall start");

    }
}
