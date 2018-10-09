package com.windy.game.engine.server;

/**
 * 服务器类型
 *
 * @author jiaxiaocheng
 * @create 2018-10-09 10:33
 * QQ:909633131
 **/
public enum ServerType {
    NONE(-1),
    /**网关*/
    GATE(1),
    GAME(2),
    /*集群管理服*/
    CLUSTER(3),
    LOG(4),
    /*聊天服务器*/
    CHAT(5),
    PAY(6),
    /*大厅服务器*/
    HALL(7),
    /*捕鱼达人*/
    GAME_BYDR(101),
    GAME_BYDR_WORLD(102),
    /*备用*/
    GATE_3(103),
    GATE_4(104),
    GATE_5(105),
    GATE_6(106),
    ;

   public static ServerType valueof(int type){

       for(ServerType t : ServerType.values()){
           if(t.getType() == type){
               return t;
           }
       }
       return NONE;
   }

   private final int type;

   private ServerType(int type){
       this.type = type;
   }

   public int getType(){
       return  this.type;
   }
}
