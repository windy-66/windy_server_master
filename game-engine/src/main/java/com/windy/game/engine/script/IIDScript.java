package com.windy.game.engine.script;

/**
 * 有ID的脚本
 *
 * @author jiaxiaochneg
 * @create 2018-10-08 15:51
 **/
public interface IIDScript extends IScript{

    /**
     *
     * @return 脚本ID，一般用于处理特殊的逻辑，策划配置的ID
     */
    int getModelID();
}
