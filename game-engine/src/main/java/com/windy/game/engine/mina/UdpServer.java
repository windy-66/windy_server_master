package com.windy.game.engine.mina;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.transport.socket.nio.NioDatagramAcceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.windy.game.engine.mina.config.MinaServerConfig;
/**
 * UDP 服务器
 *
 * @author jiaxiaocheng
 * @create 2018-10-08 17:40
 * QQ:909633131
 **/
public class UdpServer implements Runnable{

    private static final Logger log = LoggerFactory.getLogger(UdpServer.class);
    private MinaServerConfig minaServerConfig;
    private IoHandler ioHandler;
    private NioDatagramAcceptor acceptor;
    public UdpServer(MinaServerConfig minaServerConfig, IoHandler ioHandler) {
        super();
        this.minaServerConfig = minaServerConfig;
        this.ioHandler = ioHandler;
        acceptor = new NioDatagramAcceptor();
    }
    @Override
    public void run() {

    }

}
