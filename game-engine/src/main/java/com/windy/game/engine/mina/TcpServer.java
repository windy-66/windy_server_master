package com.windy.game.engine.mina;

import java.util.Map;


import com.windy.game.engine.mina.config.MinaServerConfig;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory;
import org.apache.mina.filter.executor.OrderedThreadPoolExecutor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TCP 服务器
 *
 * @author jiaxiaocheng
 * @create 2018-10-09 15:20
 * QQ:909633131
 **/
public class TcpServer implements Runnable{

    private static final Logger log = LoggerFactory.getLogger(TcpServer.class);
    private final MinaServerConfig minaServerConfig;
    private final NioSocketAcceptor acceptor;
    private final IoHandler ioHandler;
    private ProtocolCodecFactory factory;
    // 消息处理线程,使用有序线程池，保证所有session事件处理有序进行，比如先执行消息执行，再是消息发送，最后关闭事件
    private OrderedThreadPoolExecutor threadpool;
    private Map<String, IoFilter> filters; //过滤器

    protected boolean isRunning = false; //服务器是否运行

    /**
     *
     * @param minaServerConfig  配置
     * @param ioHandler  消息处理器
     */
    public TcpServer(MinaServerConfig minaServerConfig, IoHandler ioHandler){
           this.minaServerConfig = minaServerConfig;
           this.ioHandler = ioHandler;
           this.acceptor  = new NioSocketAcceptor();
    }

    /**
     *
     * @param minaServerConfig  配置
     * @param ioHandler  消息处理器
     * @param factory  消息工厂
     */
    public TcpServer(MinaServerConfig minaServerConfig, IoHandler ioHandler,ProtocolCodecFactory factory){
       this(minaServerConfig, ioHandler);
       this.factory = factory;
    }

    /**
     *
     * @param minaServerConfig
     * @param ioHandler
     * @param factory
     * @param filters
     * 不要包含消息解码、线程池过滤器，已默认添加
     */
    public TcpServer(MinaServerConfig minaServerConfig, IoHandler ioHandler, ProtocolCodecFactory factory,
                     Map<String, IoFilter> filters) {
        this(minaServerConfig, ioHandler, factory);
        this.filters = filters;
    }
    /**
     * 连接人数
     * @return
     * */
    public int getManagedSessionCount(){
        return this.acceptor ==null? 0: this.acceptor.getManagedSessionCount();
    }
    /**
     * 广播所有连接的消息
     *
     * @param obj
     */
    public void broadcastMsg(Object obj){
        this.acceptor.broadcast(obj);
    }
    @Override
    public void run() {
        synchronized (this){
           if(!isRunning){
               isRunning = true;
               DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
               if(factory == null){
                   factory = new DemuxingProtocolCodecFactory();
               }

               if(factory instanceof DefaultProtocolCodecFac){

               }
           }
        }
    }
}
