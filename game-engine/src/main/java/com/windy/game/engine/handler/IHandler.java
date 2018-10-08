package com.windy.game.engine.handler;

import org.apache.mina.core.session.IoSession;

/**
 * 处理器接口
 *
 * @author jiaxiaochneg
 * @create 2018-10-08 17:02
 **/
public interface IHandler extends Runnable {

    /*
    * 会话
    * */
    IoSession getSession();

    /*
    * 会话
    * @param session
    * */
    void setSession(IoSession session);

    /*
    * 请求消息
    * @return
    * */
    Object getMessage();

    /*
    * 消息
    * @return
    * */
    void setMessage(Object message);

    /**
     * 创建时间
     */
    long getCreateTime();

    /**
     * 创建时间
     * @param time
     */
    void setCreateTime(long time);

    /**
     * http 参数
     * @return
     */
    Object getParameter();

    /**
     * http 参数
     * @return
     */
    void setParameter(Object parameter);
}
