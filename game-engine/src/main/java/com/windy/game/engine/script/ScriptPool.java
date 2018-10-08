package com.windy.game.engine.script;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 脚本加载管理容器
 * <br>
 * 服务定位器模式
 * @author jiaxiaocheng
 * @create 2018-10-08 16:09
 **/
public final class ScriptPool {
   private static final Logger LOGGER = LoggerFactory.getLogger(ScriptPool.class);
   //源文件夹
   private String sourceDir;
   //输出文件夹
   private String outDir;
   //附加的jar包地址
   private String jarsDir;

   // 脚本容器
    Map<String, Map<String,IScript>> scriptInstances = new ConcurrentHashMap<>(0);
    Map<String, Map<String, IScript>> tmpScriptInstances = new ConcurrentHashMap<>(0);
    Map<Integer, IIDScript> idScriptInstances = new ConcurrentHashMap<>(0);
    Map<Integer, IIDScript> tmpIdScriptInstances = new ConcurrentHashMap<>(0);
    // tcp handler容器
//    Map<Integer, Class<? extends IHandler>> tcpHandlerMap = new ConcurrentHashMap<>(0);
//    Map<Integer, HandlerEntity> tcpHandlerEntityMap = new ConcurrentHashMap<>(0);

    // http handler容器
//    Map<String, Class<? extends IHandler>> httpHandlerMap = new ConcurrentHashMap<>(0);
//    Map<String, HandlerEntity> httpHandlerEntityMap = new ConcurrentHashMap<>(0);

    public ScriptPool() {
    }

}
