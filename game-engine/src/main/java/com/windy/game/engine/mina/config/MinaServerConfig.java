package com.windy.game.engine.mina.config;

import com.windy.game.engine.server.BaseServerConfig;
import com.windy.game.engine.server.ServerType;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * mina server 配置文件
 *
 * @author jiaxiaocheng
 * @create 2018-10-08 23:09
 * QQ:909633131
 **/
@Root
public class MinaServerConfig extends BaseServerConfig{

    //mina 地址
    @Element(required = false)
    private String ip;

    //mina 端口
    @Element(required = false)
    private int port = 8500;

    // http 服务器地址
    @Element(required = false)
    private String httpUrl;

    //http 服务器端口
    @Element(required = false)
    private  int httpPort;

    // 服务器类型
    @Element(required = false)
    private ServerType type = ServerType.GATE;

    //mina 服务器线程池大小
    @Element(required = false)
    private int orderedThreadPoolExecutorSize = 300;

    //是否重用地址
    @Element(required = false)
    private boolean reuseAddress = true;

    //tcp 没有延迟
    @Element(required = false)
    private boolean tcpNoDelay = true;

    //读取空闲时间检测
    @Element(required = false)
    private int readerIdleTime = 120;

    //写入空闲时间检测
    @Element(required = false)
    private int writeIdleTime = 120;

    @Element(required = false)
    private int soLinger = 0;

    //网络带宽：负载均衡时做判断依据，以1M支撑64人并发计算
    @Element(required = false)
    private int netSpeed = 64 * 5;

    //限制每秒会话可接受的消息数，超过则关闭
    @Element(required = false)
    private int maxCountPerSecond = 30;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port){
        this.port = port;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public ServerType getType() {
        return type;
    }

    public void setType(ServerType type) {
        this.type = type;
    }


    public int getOrderedThreadPoolExecutorSize() {
        return orderedThreadPoolExecutorSize;
    }

    public void setOrderedThreadPoolExecutorSize(int orderedThreadPoolExecutorSize) {
        this.orderedThreadPoolExecutorSize = orderedThreadPoolExecutorSize;
    }

    public boolean isReuseAddress(){
        return this.reuseAddress;
    }

    public void  setReuseAddress(boolean reuseAddress){
        this.reuseAddress = reuseAddress;
    }

    public boolean isTcpNoDelay() {
        return tcpNoDelay;
    }

    public void setTcpNoDelay(boolean tcpNoDelay) {
        this.tcpNoDelay = tcpNoDelay;
    }

    public int getReaderIdleTime() {
        return readerIdleTime;
    }

    public void setReaderIdleTime(int readerIdleTime) {
        this.readerIdleTime = readerIdleTime;
    }

    public int getWriteIdleTime() {
        return writeIdleTime;
    }

    public void setWriteIdleTime(int writeIdleTime) {
        this.writeIdleTime = writeIdleTime;
    }

    public int getSoLinger() {
        return soLinger;
    }

    public void setSoLinger(int soLinger) {
        this.soLinger = soLinger;
    }

    public int getNetSpeed() {
        return netSpeed;
    }

    public void setNetSpeed(int netSpeed) {
        this.netSpeed = netSpeed;
    }

    public int getMaxCountPerSecond() {
        return maxCountPerSecond;
    }

    public void setMaxCountPerSecond(int maxCountPerSecond) {
        this.maxCountPerSecond = maxCountPerSecond;
    }
}
