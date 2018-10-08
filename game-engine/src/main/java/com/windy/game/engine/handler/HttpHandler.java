package com.windy.game.engine.handler;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.http.HttpRequestImpl;
import org.apache.mina.http.api.HttpStatus;

/**
 * Http请求
 *
 * @author jiaxiaocheng
 * @create 2018-10-08 17:32
 **/
//public class HttpHandler implements IHandler{
    public class HttpHandler{
//    private HttpResponseImpl response; // 返回消息
    private IoSession session; // 消息来源
    private HttpRequestImpl request; // 请求消息

    private long createTime;

}
