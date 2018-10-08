package com.windy.game.engine.script;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 心跳脚本
 *
 * @author jiaxiaochneg
 * @create 2018-10-08 16:01
 **/
public interface ITimerEventScript extends IScript{


    /**
     * 每秒执行
     * @param localTime
     */
    default void secondHandler(LocalTime localTime){

    }

    default void minuteHandler(LocalTime localTime) {

    }

    default void hourHandler(LocalTime localTime) {

    }

    default void dayHandler(LocalDateTime localDateTime) {

    }
}
