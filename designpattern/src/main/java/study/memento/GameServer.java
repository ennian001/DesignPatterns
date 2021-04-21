package study.memento;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 游戏服务其
 * 管理者
 */
public class GameServer {

    //管理备忘录信息的
    Map<Integer,GameRecord> records = new HashMap<>() ;

    int i = 1 ;

    void add(GameRecord gameRecord){
        gameRecord.setId(i++);
        records.put(gameRecord.id,gameRecord) ;
    }

    SunEnnianGamer getRecord(Integer id) throws InvocationTargetException, IllegalAccessException {
        GameRecord gameRecord = records.get(i);
        //从备忘录里面获取的内容还要逆转
        SunEnnianGamer sunEnnianGamer = new SunEnnianGamer() ;
        BeanUtils.copyProperties(sunEnnianGamer,gameRecord);
        return sunEnnianGamer ;
    }
}
