package ru.zaur.spring.aspects;
import ru.zaur.spring.components.interfaces.ICriticismEngine;
/**
 * Created by Администратор on 08.11.2016.
 */
public aspect JudgeAspect {
    public JudgeAspect() {}
    pointcut performance() : execution(* perform(..));
    after() returning() : performance() {
        System.out.println(criticismEngine.getCriticism());
    }
    // внедряется
    private ICriticismEngine criticismEngine;
    public void setCriticismEngine(ICriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}