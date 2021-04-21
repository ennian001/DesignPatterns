package study.memento;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

/**
 * 游戏当前者
 * 当前游戏信息
 */
@Data
public class SunEnnianGamer {
    //剩余金币
    Integer coin ;
    //血量
    Integer hp ;
    //蓝量
    Integer mp ;
    //等级
    Integer level;
    //以上是内部状态， 我们需要记录保存的信息
    GameServer gameServer = new GameServer() ;

    //保存游戏记录
   void saveGameRecord() throws Exception{
       System.out.println("正在保存当前记录.................");
       GameRecord gameRecord = new GameRecord() ;
       //当前游戏保存到备忘录
       BeanUtils.copyProperties(gameRecord,this);
       gameServer.add(gameRecord);
   }

   //从备忘录获取游戏历史存档
    SunEnnianGamer getFromMemento(Integer id) throws InvocationTargetException, IllegalAccessException {
        System.out.println("获取游戏历史存档信息...........");
        SunEnnianGamer record = gameServer.getRecord(id);
        return record ;
    }

    //玩游戏
    void playGame(){
        int i = new Random().nextInt();
        System.out.println("................()..............."+i);
        coin = i ;
        hp = i ;
        mp = i ;
        level = i ;
    }

    //退出游戏
    void exitGame() throws Exception {
        System.out.println("退出&存档");
        saveGameRecord();
    }
}
