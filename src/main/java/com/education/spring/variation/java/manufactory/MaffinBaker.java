package com.education.spring.variation.java.manufactory;
import com.education.spring.variation.java.consts.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MaffinBaker implements Baker {
    private Consts consts;

    @Autowired
    public MaffinBaker(Consts consts) {
        this.consts = consts;
    }

    public Consts getConsts() {
        return consts;
    }

    public void setConsts(Consts consts) {
        this.consts = consts;
    }

    public void bake() {
        System.out.println("Oh, " + consts.MAFFIN + " is ready for u!");
    }
}
