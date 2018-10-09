package com.windy.game.engine.code;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Predicate;

/**
 * 消息编码
 *
 * @author jiaxiaocheng
 * @create 2018-10-09 18:47
 * QQ:909633131
 **/
public class ProtocolEncoderImpl implements ProtocolEncoder {

    protected static Logger log = LoggerFactory.getLogger(ProtocolEncoderImpl.class);

    /**
     * 允许的最大堆积未发送消息条数
     */
    protected int maxScheduledWriteMessages = 256;
    /**
     * 当超过设置的最大堆积消息条数时的处理
     */
    protected Predicate<IoSession> overScheduledWriteBytesHandler;

    public ProtocolEncoderImpl() {
    }

}
