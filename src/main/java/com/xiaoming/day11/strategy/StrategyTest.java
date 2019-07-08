package com.xiaoming.day11.strategy;

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/8 22:24
 * @Description:    初级会员 针对算法A算法
 */
 class StrategyA  extends Strategy{

    @Override
    void algorithmInterface() {
        System.out.println("初级会员，针对A算法");
    }
}

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/8 22:24
 * @Description:    中级会员 针对算法B算法
 */
 class StrategyB  extends Strategy{

    @Override
    void algorithmInterface() {
        System.out.println("中级会员 针对算法B算法");
    }
}

/**
 * @Author:         xiaoming
 * @CreateDate:     2019/7/8 22:24
 * @Description:    高级会员 针对算法C算法
 */
 class StrategyC  extends Strategy{

    @Override
    void algorithmInterface() {
        System.out.println("高级会员 针对算法C算法");
    }
}

class Context{
    private Strategy strategy;
    Context(Strategy strategy){
        this.strategy = strategy;
    }

    void algorithmInterface() {
        strategy.algorithmInterface();
    }
}
public class StrategyTest {
    public static void main(String[] args) {
        Context context = null;
        Strategy strategyA = new StrategyA();
         context = new Context(strategyA);
        context.algorithmInterface();


        Strategy strategyB = new StrategyB();
        context = new Context(strategyB);
        context.algorithmInterface();

        Strategy strategyC = new StrategyC();
        context = new Context(strategyC);
        context.algorithmInterface();
    }
}
